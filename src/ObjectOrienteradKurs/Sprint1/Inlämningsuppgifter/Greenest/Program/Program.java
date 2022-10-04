package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Kaktus;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.KöttätandeVäxt;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Palm;
import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Växter;

import java.util.Arrays;
import java.util.List;

public class Program {

    public static void växtProgram() {

        // Här är ett exempel på polymorfism (Objekt växt som är något annat också.)
        Växter v1 = new Kaktus(0.2, "Igge");
        Växter v2 = new Palm(5, "Laura");
        Växter v3 = new KöttätandeVäxt(0.7, "Meatloaf");
        Växter v4 = new Palm(1, "Putte");

        // Lägger in i Arraylist
        List<Växter> plantList = Arrays.asList(v1, v2, v3, v4);

        // Loop startas medan run = true
        boolean run = true;
        while (run) {
            String plantName = Message.waterWhatPlant(); // Kallar metoden waterWhatPlant och sätter värdet i plantName.

            if (plantName == null) { // Ifall knappen cancel trycks, avlutas programmet.
                Message.exitMessage();
                break;
            }

            // Letar igenom plantList efter en matchning på namnet. ifall den hittar blir hittat = true.
            boolean hittat = false;
            for (Växter element : plantList) {

                // Om det blir matchning, kalla på metoden vattnaMedVad.
                if (element.getNamn().toLowerCase().equals(plantName)) {
                    element.vattnaMedVad();
                    hittat = true;
                    run = Message.tryAgain(); // om kund avbryter returneras en boolean som stänger loop.
                }
            }
            if (!hittat) { // Om namnet inte hittats i plantList får användare chans att försöka igen eller avbryta.
                Message.nameNotFound();
                run = Message.tryAgain();
            }
        }
    }
}
