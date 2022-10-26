package ObjectOrienteradKurs.Sprint3.Övningsuppgift2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import static java.awt.BorderLayout.*;
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.SOUTH;
import static javax.swing.SwingConstants.*;


public class Bensinräknare implements ActionListener {

    public Bensinräknare() {
        Scanner input = new Scanner(System.in);

        int a = 100;
        int b = 200;
        int c = 300;

        JTextField mätareNu = new JTextField(20);
        JTextField MätareÅr = new JTextField(20);
        JTextField förbrukning = new JTextField(20);

        // Frame - Panel - Label

        // west - east
        // South

        JLabel drivenMilesLabel = new JLabel("Antal körda mil: ");
        JLabel gasLiterLabel = new JLabel("Antal liter bensin: ");
        JLabel consumptionLabel = new JLabel("Förbrukning per mil: ");


        // input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Ange mätarställning nu: "));
        inputPanel.add(mätareNu);
        inputPanel.add(new JLabel("Ange mätarställning för ett år sedan: "));
        inputPanel.add(MätareÅr);
        inputPanel.add(new JLabel("Ange antal liter förbrukad bensin: "));
        inputPanel.add(förbrukning);


        // Green panel
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new GridLayout(1, 3));
        outputPanel.add(new JLabel("Antal körda mil: " + a));
        outputPanel.add(new JLabel("Antal liter bensin: " + b));
        outputPanel.add(new JLabel("Förbrukning per mil: " + c));


        // Mainframe
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(outputPanel, CENTER);
        frame.pack();


        mätareNu.addActionListener(this);
        MätareÅr.addActionListener(this);
        förbrukning.addActionListener(this);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == förbukning)
    }


    public static void main(String[] args) {
        Bensinräknare bR = new Bensinräknare();
    }

}
