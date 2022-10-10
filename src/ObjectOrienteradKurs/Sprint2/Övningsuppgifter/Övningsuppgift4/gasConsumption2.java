package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class gasConsumption2 {
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
    Scanner input = new Scanner(System.in);

    public double inputMeterSettingToday() {
        while (true) {
            try {
                System.out.println("Vad står milmätaren på idag? ");
                meterSettingToday = input.nextDouble();
                break;


            } catch (InputMismatchException e) {
                System.out.println("Får endast använda positiva siffror");
                input.next();
            }
        }
        return meterSettingToday;
    }

    public double inputMeterSettingOneYearAgo() {
        while (true) {
            try {
                System.out.println("Vad stod milmätaren på för 1 år sedan? ");
                meterSettingOneYearAgo = input.nextDouble();
                break;


            } catch (InputMismatchException e) {
                System.out.println("Får endast använda positiva siffror");
                input.next();
            }
        }
        return meterSettingOneYearAgo;
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
                System.out.println("Hur mycket bränsle har tankats? ");
                filledGas = input.nextDouble();
                break;


            } catch (InputMismatchException e) {
                System.out.println("Får endast använda positiva siffror");
                input.next();
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
}
