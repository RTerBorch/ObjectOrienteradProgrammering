package ObjectOrienteradKurs.Sprint2.Inlämningsuppgift2;

import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class ListReader {
    private String infoString = "";
    private String dateString = "";

    Membership membership = new Membership();

    public String getInfoString() {
        return infoString;
    }

    public String getDateString() {
        return dateString;
    }


    public String[] splitInfoString(String userInput) {
        //Separerar personNr & namn
        //[0]=socialNr, [1]=name
        String[] infoArray = userInput.split(",");
        infoArray[1] = infoArray[1].trim();

        //Sparar namn & personNr
        membership.setName(infoArray[1]);
        membership.setSocialNumber(infoArray[0]);

        return infoArray;
    }

    public void returnMatch(Scanner inputScanner, String userInput) {
        // Om matchning görs med personNr eller namn ändras matchFound till True;
        boolean matchFound = false;

        // Medans det finns text att läsa i dokument går programmet igenom alla kunder och letar match i namn eller personNr.
        while (inputScanner.hasNext()) {

            // Varje kund har 2 strängar innan nästa kund
            // Separerar infoString till personNr & namn array. [0]=socialNr, [1]=name
            infoString = inputScanner.nextLine();
            String[] infoArray = splitInfoString(infoString);

            // Kundens senaste betaldatum hamnar i egen sträng.
            dateString = inputScanner.nextLine();

            // Om matchning görs med personNr eller namn ändras matchFound till True;
            if (infoArray[0].equalsIgnoreCase(userInput) || infoArray[1].equalsIgnoreCase(userInput)) {
                matchFound = true;
                membership.setCustomerHistory(true);
                break;
            }
        }
        // Om ingen matchning gjorts, finns ingen kundhistorik. Alltså ej Behörig
        if (!matchFound) {
            membership.setCustomerHistory(false);
        }
    }

    public int[] splitDateString(String userInput) {
        // Separerar datumSträng och sätter in i en array på 3 platser. yy mm dd
        String[] dateString = userInput.split("-");
        int[] date = {Integer.parseInt(dateString[0]), Integer.parseInt(dateString[1]), Integer.parseInt(dateString[2])};

        return date;


    }

    public boolean isMember(String dateString) {
        // Använder metoden splitDateString för att förändra dateString till passande int array.
        int[] date = splitDateString(dateString);

        LocalDate dateInput = LocalDate.of(date[0], date[1], date[2]);
        LocalDate dateToday = LocalDate.now();

        return (!dateInput.isBefore(dateToday.minusYears(1)));

    }
    public void writeLog(String infoString) {
        // Tar in personNr + namn, använder metoden splitInfoString för att separera String till [0]=personNr, [1]=namn
        String[] infoStringArray = splitInfoString(infoString);

        // Skriver kundens besök i en egen fil som skapas för kund om den inte redan finns.
        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(infoStringArray[1] + " - " + infoStringArray[0], true))) {


                writer.write("Personnr: " + infoStringArray[0] + "\tNamn: " + infoStringArray[1] + "\tBesöksdatum: " + LocalDate.now() + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Fel vid loggning av kund");
        } catch (Exception e) {
            System.out.println("Okänt fel");
        }
    }


    public Scanner readGymRecords() {
        // Skapar en metod som läser från fil genom en scanner.
        // Denna scanner returneras genom metod.
        Scanner scannerList;
        try {
            scannerList = new Scanner(new FileReader("src/ObjectOrienteradKurs/Sprint2/Inlämningsuppgift2/GymRecords.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("GymRecords gick inte att läsa");
            throw new RuntimeException(e);
        }
        return scannerList;
    }


}
