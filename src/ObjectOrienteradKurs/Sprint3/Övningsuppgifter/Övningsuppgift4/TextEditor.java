package ObjectOrienteradKurs.Sprint3.Övningsuppgifter.Övningsuppgift4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class TextEditor extends JFrame implements ActionListener {
    private String temp = "";

    private final JPanel panel = new JPanel();
    private final JPanel buttonPanel = new JPanel();

    private final JTextArea area = new JTextArea(10, 60);
    private final JScrollPane scrollPane = new JScrollPane(area);
    private final JButton doubleButton = new JButton("Double");
    private final JButton clearButton = new JButton("Clear");

    private final JButton openButton = new JButton("Öppna");
    private final JButton saveButton = new JButton("Spara");
    private final JButton printButton = new JButton("Skriv ut");
    private final JButton exitButton = new JButton("Avsluta");
    private final JTextField userInputTxt = new JTextField(20);
    private String userInput = "";


    private final JLabel fileName = new JLabel("Filnamn");


    // read&Write
    Scanner scan;
    BufferedWriter writer;


    public TextEditor() {


        // TextArea
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        panel.setLayout(new BorderLayout());

        // Buttons
        buttonPanel.add(fileName);
        buttonPanel.add(userInputTxt);
        buttonPanel.add(doubleButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(printButton);
        buttonPanel.add(exitButton);

        // Placeringar
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.NORTH);

        // Listeners
        doubleButton.addActionListener(this);
        clearButton.addActionListener(this);
        userInputTxt.addActionListener(this);
        clearButton.addActionListener(this);
        openButton.addActionListener(this);
        saveButton.addActionListener(this);
        printButton.addActionListener(this);
        exitButton.addActionListener(this);

        // JFrame builder
        add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override //ObjectOrienteradKurs/Sprint3/Övningsuppgifter/Övningsuppgift4/taskDokument.txt
    public void actionPerformed(ActionEvent e) {

        // Rensa texten
        if (e.getSource() == clearButton) {
            area.setText(null);
        }
        // Dubblera texten
        else if (e.getSource() == doubleButton) {
            String temp = area.getText() + area.getText();
            area.setText(temp);
        }
        // Läs in från fil
        else if (e.getSource() == userInputTxt || (e.getSource() == openButton && userInputTxt != null)) {
            // else if (e.getSource() == userInputTxt) {
            userInput = userInputTxt.getText();

            {
                try {
                    scan = new Scanner(new FileReader(userInput));
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Hittar ej fil");
                    throw new RuntimeException(ex);
                }
            }

            while (scan.hasNext()) {
                String temp2 = scan.nextLine() + "\n";
                temp = temp + temp2;
            }
            area.setText(temp);

        }
        // Save text
        else if (e.getSource() == saveButton) {
            try {
                writer = new BufferedWriter(new FileWriter("SavedDoc.txt"));

                writer.write(area.getText());
                writer.flush();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Saved");
        }
        // Print
        else if (e.getSource() == printButton) {
            JOptionPane.showMessageDialog(null, area.getText());
        }

        // Avsluta
        else if (e.getSource() == exitButton) {
            JOptionPane.showMessageDialog(null, "Stänger programmet!");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        TextEditor te = new TextEditor();
    }
}
