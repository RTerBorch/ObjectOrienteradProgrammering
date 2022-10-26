package ObjectOrienteradKurs.Sprint3.Övningsuppgift2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gasConsumption extends JFrame implements ActionListener {

    JTextField meterNow = new JTextField();
    JTextField meterBefore = new JTextField();
    JTextField expendedGas = new JTextField();

    JTextField DrivenMiles = new JTextField();
    JTextField gasLiters = new JTextField();
    JTextField gasPerMile = new JTextField();

    /*
    System.out.println("Antal körda mil: " + antalKördaMil());
        System.out.println("Antal liter bensin: " + filledGas);
        System.out.println("Förbrukning per mil: " + gasConsumptionPerMil());

     */
    public gasConsumption(){

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        this.add(panel);





    }

    /*
    public ActionListener(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        button.addActionListener(this);

        this.add(panel);
        panel.add(label);
        panel.add(button);

        this.pack();
        this.setLocation(1000,500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     */



   private double meterSettingToday;
   private double meterSettingOneYearAgo;
   private double filledGas;

    public double getMeterSettingToday() {
        return meterSettingToday;
    }

    public double getMeterSettingOneYearAgo() {
        return meterSettingOneYearAgo;
    }

    public double getFilledGas() {
        return filledGas;
    }

    public double inputMeterSettingToday() {
        while (true) {
            try {
                String meterSettingTodayString = JOptionPane.showInputDialog(null, "Vad står milmätaren på idag? ");
                meterSettingToday = Double.parseDouble(meterSettingTodayString);
                break;


            } catch (NumberFormatException e) {
                System.out.println("Får endast använda positiva siffror");
            }
        }
        return meterSettingToday;
    }

    public double inputMeterSettingOneYearAgo() {
        while (true) {
            try {
                String meterSettingOneYearAgoString = JOptionPane.showInputDialog(null, "Vad stod milmätaren på för 1 år sedan? ");
                meterSettingOneYearAgo = Double.parseDouble(meterSettingOneYearAgoString);
                break;


            } catch (NumberFormatException e) {
                System.out.println("Får endast använda positiva siffror");
            }
        }
        return meterSettingToday;
    }

    public void setMeterSettingToday(double meterSettingToday) {
        this.meterSettingToday = meterSettingToday;
    }

    public void setMeterSettingOneYearAgo(double meterSettingOneYearAgo) {
        this.meterSettingOneYearAgo = meterSettingOneYearAgo;
    }

    public void setFilledGas(double filledGas) {
        this.filledGas = filledGas;
    }

    public double inputFilledGas() {
        while (true) {
            try {
                String filledGasString = JOptionPane.showInputDialog(null, "Hur mycket bränsle har tankats? ");
                filledGas = Double.parseDouble(filledGasString);
                break;


            } catch (NumberFormatException e) {
                System.out.println("Får endast använda positiva siffror");
            }
        }

        return filledGas;
    }


    public double antalKördaMil() {

        return  meterSettingToday - meterSettingOneYearAgo;
    }

    public double gasConsumptionPerMil() {
        return filledGas / antalKördaMil();
    }

    public void callInputs(){
        inputMeterSettingToday();
        inputMeterSettingOneYearAgo();
        inputFilledGas();

        System.out.println("Antal körda mil: " + antalKördaMil());
        System.out.println("Antal liter bensin: " + filledGas);
        System.out.println("Förbrukning per mil: " + gasConsumptionPerMil());



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main (String[] args){


        gasConsumption Volvo = new gasConsumption();
     //   Volvo.callInputs(); // Kallar alla inputs



    }


}
