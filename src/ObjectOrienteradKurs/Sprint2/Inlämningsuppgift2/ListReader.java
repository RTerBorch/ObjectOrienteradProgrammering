package ObjectOrienteradKurs.Sprint2.Inlämningsuppgift2;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class ListReader {
    private String infoString = "";
    private String dateString = "";
    private String testInput = "";
    Membership membership = new Membership();

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public String getInfoString() {
        return infoString;
    }

    public void setInfoString(String infoString) {
        this.infoString = infoString;
    }

    public String getDateString() {
        return dateString;
    }

    public String[] splitInfoString(String userInput) {
        //[0]=socialNr, [1]=name
        String[] infoArray = userInput.split(",");
        infoArray[1] = infoArray[1].trim();

        //Sparar namn & personNr
        membership.setName(infoArray[1]);
        membership.setSocialNumber(infoArray[0]);

        return infoArray;
    }

    public void returnMatch(Scanner inputScanner, String userInput) {
        boolean matchFound = false;

        userInput = userInput;

        // separera namn och personnr

        while (inputScanner.hasNext()) {

            // Varje kund har 2 strängar innan nästa kund
            infoString = inputScanner.nextLine();
            String[] infoArray = splitInfoString(infoString);
            dateString = inputScanner.nextLine();

            if (infoArray[0].equalsIgnoreCase(userInput) || infoArray[1].equalsIgnoreCase(userInput)) {
                matchFound = true;
                membership.setCustomerHistory(true);
                break;
            }
/*
            // Om matchning på userInput görs, avbryts loop och findCustomer returnerar true.
            if (infoString.contains(userInput)) {
                matchFound = true;
                membership.setCustomerHistory(true);
                break;
            }

 */
        }

        // Om ingen matchning görs, ingen kundhistorik finns. Ej Behörig
        if (!matchFound) {
            membership.setCustomerHistory(false);
        }

    }

    /*
    public boolean findCustomer(String userInput) {
        boolean matchFound = false;

        try {
            Scanner read = new Scanner(new FileReader("src/ObjectOrienteradKurs/Sprint2/Inlämningsuppgift2/GymRecords"));

            while (read.hasNext()) {

                // Varje kund har 2 strängar innan nästa kund
                infoString = read.nextLine().toUpperCase();
                dateString = read.nextLine().toUpperCase();

                // Om matchning på userInput görs, avbryts loop och findCustomer returnerar true.
                if (infoString.contains(userInput)) {
                    matchFound = true;
                    membership.setCustomerHistory(true);
                    break;
                }
            }
            if (!matchFound) {
                membership.setCustomerHistory(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Fel i läsning");
        }

        // om ingen matchning görs förblir denna false.
        return matchFound;
    }

     */

    public int[] splitDateString(String userInput) {
        String[] dateString = userInput.split("-");
        int[] date = {Integer.parseInt(dateString[0]), Integer.parseInt(dateString[1]), Integer.parseInt(dateString[2])};

        return date;


    }

    public boolean isMember(String dateString) {
        // Använder metoden splitDateString för att förändra String till passande int array.
        int[] date = splitDateString(dateString);

        LocalDate dateInput = LocalDate.of(date[0], date[1], date[2]);
        LocalDate dateToday = LocalDate.now();

        return (!dateInput.isBefore(dateToday.minusYears(1)));

    }

    public void writeLog(String infoString) {
        // Tar in personnr + namn, sedan separerar dessa till 2st stringar i array.[0]=personnr, [1]=namn
        String[] infoStringArray = splitInfoString(infoString);

        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(infoStringArray[1] + " - " + infoStringArray[0], true))) {


                writer.write("Personnr: " + infoStringArray[0] + "\tNamn: " + infoStringArray[1] + "\tBesöksdatum: " + LocalDate.now() + "\n");
                writer.flush();
                writer.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Fel vid loggning av kund");
        }


    }

    // Skapar en scanner metod
    public Scanner readGymRecords() {
        Scanner scannerList;
        try {
            scannerList = new Scanner(new FileReader("src/ObjectOrienteradKurs/Sprint2/Inlämningsuppgift2/GymRecords"));
        } catch (FileNotFoundException e) {
            System.out.println("GymRecords gick inte att läsa");
            throw new RuntimeException(e);
        }
        return scannerList;
    }


}
