package ObjectOrienteradKurs.Sprint2.Inlämningsuppgift2;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class ListReaderTest {

    ListReader reader = new ListReader();
    Scanner testReadTestDoc = new Scanner("7502031234, Anna Andersson\n" +
            "2022-05-03\n" +
            "8505132345, Per Persson\n" +
            "2019-12-29");


    @Test
    void returnMatch() {

        String testInput = "ANNA Andersson";
        reader.returnMatch(testReadTestDoc, testInput);

        assert reader.membership.isCustomerHistory();
        assert reader.getInfoString().equalsIgnoreCase("7502031234, Anna Andersson");
        assert reader.getDateString().equalsIgnoreCase("2022-05-03");

    }

    @Test
    void splitInfoString() {
        String splitTextInput = "7502031234, Anna Andersson";
        String[] infoStringArray = reader.splitInfoString(splitTextInput);

        assert infoStringArray[0].equals("7502031234");
        assert infoStringArray[1].equals("Anna Andersson");
    }

    @Test
    public void separateDateToInts() {

        String splitTextInput = "2022-05-03";
        int[] dateStringArray = reader.splitDateString(splitTextInput);

        assert dateStringArray[0] == 2022;
        assert dateStringArray[1] == 5;
        assert dateStringArray[2] == 3;

    }


    @Test
    public void isMembershipStillValid() {

        String dateString = (LocalDate.now().toString()); // Dagens datum ska bli rätt (inom 1 år från nu)
        String dateString2 = "2021-10-15"; // ska bli fel (mer än 1 år)
        reader.isMember(dateString);

        assert reader.isMember(dateString);
        assert !reader.isMember(dateString2);
    }

    @Test
    public void writeToDokument() {
        // Testar så att skrift till dokument får rätt dokumentnamn samt rätt text som visar efter läsning.

        String infoString = "7502031234, Anna Andersson";

        // Skriver till dokument, dokumentet får personnr som namn.
        reader.writeLog("7502031234, Anna Andersson");

        try {
            Scanner input = new Scanner(new FileReader("Anna Andersson - 7502031234"));

            assert input.nextLine().equals("Personnr: 7502031234\tNamn: Anna Andersson\tBesöksdatum: " + LocalDate.now() );

        } catch (Exception e) {
            System.out.println("Kunde inte läsa fil");
            e.printStackTrace();
        }

    }

    @Test
    public void removeTestFile() {
    // Fungerar ej som den ska i test, utan bara separat.
        // Låter den vara kvar som extra funktion

        try {

            File f = new File("Anna Andersson - 7502031234"); // Tar bort demofil

            if (f.delete()) //returnerar boolean
            {
                System.out.println(f.getName() + " deleted");   //Skriver filnamn + deleted om den lyckas
            } else {
                System.out.println("Could not delete testFile"); // annars failed
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

