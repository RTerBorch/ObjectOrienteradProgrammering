package ObjectOrienteradKurs.Sprint2.Inlämningsuppgift2;

import java.io.BufferedWriter;
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
        String[] infoArray = userInput.split(",");
        infoArray[1] = infoArray[1].trim();

        return infoArray;


    }


    public void returnMatch(Scanner inputList, String userInput) {
        boolean matchFound = false;
        userInput = userInput.toUpperCase();

        while (inputList.hasNext()) {
            // Varje kund har 2 strängar innan nästa kund
            infoString = inputList.nextLine().toUpperCase();
            dateString = inputList.nextLine().toUpperCase();

            // Om matchning på userInput görs, avbryts loop och findCustomer returnerar true.
            if (infoString.contains(userInput)) {
                matchFound = true;
                membership.setCustomerHistory(true);
                break;
            }
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

    public boolean isMember(String userInput) {
        int[] date = splitDateString(userInput);

        LocalDate dateInput = LocalDate.of(date[0], date[1], date[2]);
        LocalDate dateToday = LocalDate.now();

        return (!dateInput.isBefore(dateToday.minusYears(1)));

    }

    public void writeLog(String infoString) {
        // Tar in personnr + namn, sedan separerar dessa till 2st stringar i array.[0]=personnr, [1]=namn
        String[] infoStringArray = splitInfoString(infoString);

        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(infoStringArray[0]))) {


                writer.write("Personnr: " + infoStringArray[0] + "\tNamn: " + infoStringArray[1] + "\tBesöksdatum: " + LocalDate.now());
                writer.flush();
                writer.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
