package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program;

import javax.swing.*;

public interface Message {

    void vattnaMedVad();

    static String waterWhatPlant() {
        // Frågar användaren vilken planta som ska vattnas, returnerar String med inmatning.
        var waterWhatPlant = JOptionPane.showInputDialog(null, "Vilken växt vill du vattna? ");

        // Om personen gjort en inmatning görs strängen till lowercase samt trimmar bort blanksteg.
        if (waterWhatPlant != null) {
            waterWhatPlant = waterWhatPlant.trim();
            waterWhatPlant = waterWhatPlant.toLowerCase();
        }
        return waterWhatPlant;
    }

    static void exitMessage() { // Meddelande när programmet ska avslutas
        JOptionPane.showMessageDialog(null, "Avslutar programmet.");
    }

    static void nameNotFound() { // Ifall namnet på plantan inte hittas
        JOptionPane.showMessageDialog(null, "Namnet du angav hittades inte i listan.");
    }

    static boolean tryAgain(){ // när användare fått svar (eller inte fåt en match på namn) frågas om en omstart,

        // Frågar om användare vill fortsätta och sparar knappval i buttonChoice
        int buttonChoice = JOptionPane.showConfirmDialog(null,
                "Vill du försöka igen?");

        // Om användare inte tryckt ja, kommer ett avslutsmeddelande samt returnerar boolean false.
        // (vilket avslutar while-loop i Program)
        if (buttonChoice != 0) {
            Message.exitMessage();
            return false;
        }
        return true;
    }


}
