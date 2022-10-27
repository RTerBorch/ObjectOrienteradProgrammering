package ObjectOrienteradKurs.Sprint3.Övningsuppgifter.Övningsuppgift2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.CENTER;


public class Bensinräknare implements ActionListener {

    private double startKm = 0;

    private double endKm = 0;

    private double litresOfPetrol = 0;

    private double efficiency = 0;


    private final JTextField förbrukning = new JTextField(20);
    private final JTextField mätareNu = new JTextField(20);
    private final JTextField mätareÅr = new JTextField(20);

    private final JLabel antalKördaMilLabel = new JLabel("Antal körda mil: " + startKm);
    private final JLabel antalLiterBensinLabel = new JLabel("Antal liter bensin: " + litresOfPetrol);
    private final JLabel förbrukningLabel = new JLabel("Förbrukning per mil: " + efficiency);

    public Bensinräknare() {
        //Scanner input = new Scanner(System.in);


        // input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Ange mätarställning nu: "));
        inputPanel.add(mätareNu);
        inputPanel.add(new JLabel("Ange mätarställning för ett år sedan: "));
        inputPanel.add(mätareÅr);
        inputPanel.add(new JLabel("Ange antal liter förbrukad bensin: "));
        inputPanel.add(förbrukning);


        // Green panel
        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new GridLayout(1, 3));
        outputPanel.add(antalKördaMilLabel);
        outputPanel.add(antalLiterBensinLabel);
        outputPanel.add(förbrukningLabel);


        // Mainframe
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(outputPanel, CENTER);
        frame.pack();


        mätareNu.addActionListener(this);
        mätareÅr.addActionListener(this);
        förbrukning.addActionListener(this);



    }
/*
public double gasConsumptionPerMil() {
        return filledGas / antalKördaMil();
    }
 */

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(mätareNu.getText().isBlank() || mätareÅr.getText().isBlank() || förbrukning.getText().isBlank())) {

            try {
                // logik
                endKm = Double.parseDouble(mätareNu.getText());

                startKm = Double.parseDouble(mätareÅr.getText());

                litresOfPetrol = Double.parseDouble(förbrukning.getText());

                double antalKördaMil = calcAntalKördaMil(startKm, endKm);
                double totalGasConsumption = calcGasConsumption(litresOfPetrol, antalKördaMil);
                // Ändra JLabels längst ner med uppdaterade värden
                antalKördaMilLabel.setText("Antal körda mil: " + antalKördaMil);
                antalLiterBensinLabel.setText("Antal liter bensin: " + litresOfPetrol);
                förbrukningLabel.setText("Förbrukning per mil: " + totalGasConsumption);
            } catch(NumberFormatException numb) {
                JOptionPane.showMessageDialog(null, "Bara siffror tack!");
            } catch(ArithmeticException matte) {
                JOptionPane.showMessageDialog(null, matte.getMessage());
            }
        }
    }

    public double calcGasConsumption(double antalLiter, double antalKördaMil) {
        double total = antalLiter / antalKördaMil;
        if (antalKördaMil > 0) {
            return antalLiter / antalKördaMil;
        }
        throw new ArithmeticException("Du har ej åkt något med bilen");

    }

    public double calcAntalKördaMil(double startKm, double endKm) {
        return endKm-startKm;
    }

    public static void main(String[] args) {
        Bensinräknare bR = new Bensinräknare();
    }

}
