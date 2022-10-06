package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Kaktus;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.KöttätandeVäxt;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Palm;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Växter;

import java.util.Arrays;
import java.util.List;

public class Program {

    public static void växtProgram() {

        //Nya objekt skapas, polyformism används här för att ge objektet Växter olika egenskaper beroende på planttyp.
        Växter v1 = new Kaktus(aktuellaVäxterEnum.iggeEnum.getLängd(), aktuellaVäxterEnum.iggeEnum.getNamn());
        Växter v2 = new Palm(aktuellaVäxterEnum.lauraEnum.getLängd(), aktuellaVäxterEnum.lauraEnum.getNamn());
        Växter v3 = new KöttätandeVäxt(aktuellaVäxterEnum.meatloafEnum.getLängd(), aktuellaVäxterEnum.meatloafEnum.getNamn());
        Växter v4 = new Palm(aktuellaVäxterEnum.putteEnum.getLängd(), aktuellaVäxterEnum.putteEnum.getNamn());

        // Lägger in i Arraylist
        List<Växter> plantList = Arrays.asList(v1, v2, v3, v4);

        // Loop startas och körs tills användaren väljer att avsluta programmet
        boolean run = true;
        while (run) {

            // Kallar metoden waterWhatPlant och sätter värdet i plantName.
            String plantName = Message.waterWhatPlant();

            // Om WaterwhatPlant stängs ner, kallas metoden exitMessage och loopen avbryts.
            if (plantName == null) {
                Message.exitMessage();
                break;
            }


            // i loopen letar vi igenom matchning på namnet i plantlist.
            boolean hittat = false;
            for (Växter element : plantList) {

                // Om det blir en matchning, kallas metoden vattnaMedVad, hittat=true.
                // Användaren frågas sedan om den vill fortsätta genom metoden tryAgain.
                // Om användaren avbryter returneras en boolean false till "run" och loopen avslutas.
                if (element.getNamn().toLowerCase().equals(plantName)) {
                    element.vattnaMedVad();
                    hittat = true;
                    run = Message.tryAgain();
                }
            }
            // Om ingen matchning på namnet görs, kallas metoden tryAgain och användaren kan fortsätta eller avbryta.
            // Så länge run = true fortsätter loopen.
            if (!hittat) {
                Message.nameNotFound();
                run = Message.tryAgain();
            }
        }
    }
}
