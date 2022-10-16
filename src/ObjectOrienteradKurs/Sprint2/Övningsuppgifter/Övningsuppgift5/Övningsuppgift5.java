package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift5;

import java.util.InputMismatchException;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Övningsuppgift5 {


        public static void main (String[] arg) {

            String indata = showInputDialog
                    ("Ange antal dagar, pris per dag samt bilmodell");

            Scanner sc = new Scanner(indata);

            int antalDagar = 0;
            double dagsPris = 0;
            String bil = null;

            try {
                antalDagar = sc.nextInt();
                dagsPris = sc.nextDouble();
                bil = sc.next();
            } catch (InputMismatchException e) {
                System.out.println("Mismatch, fel värde på fel plats");
                e.getStackTrace();
            } catch (RuntimeException e){
                System.out.println("Du måste fylla i 3 ord eller siffror");
                e.getStackTrace();
            } catch (Exception e){
                e.printStackTrace();
                System.out.println("Okänd fel");
            }

            double totPris = dagsPris * antalDagar;
            String s = String.format("Totalt pris för %s: %.2f",
                    bil, totPris);
            showMessageDialog(null, s);
        }

}
