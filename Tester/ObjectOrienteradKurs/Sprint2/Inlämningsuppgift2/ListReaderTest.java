package ObjectOrienteradKurs.Sprint2.Inlämningsuppgift2;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

class ListReaderTest {

    ListReader reader = new ListReader();
    Scanner testReadTestDoc = new Scanner("7502031234, Anna Andersson\n" +
            "2022-05-03\n" +
            "8505132345, Per Persson\n" +
            "2019-12-29");

    @BeforeAll
    public static void testStart() {
        System.out.println("Beginning test");
    }

    @Test
    void ReadTestAndReturnMatch() {
        // Testar om returnMatch kan hitta med namn / personNr

        //7502031234, Anna Andersson 2022-05-03
        //8505132345, Per Persson 2019-12-29

        String testInput1 = "ANNA Andersson";
        reader.returnMatch(testReadTestDoc, testInput1);

        assert reader.membership.isCustomerHistory();
        assert reader.getInfoString().equalsIgnoreCase("7502031234, Anna Andersson");
        assert reader.getDateString().equalsIgnoreCase("2022-05-03");

        String testInput2 = "8505132345";
        reader.returnMatch(testReadTestDoc, testInput2);

        assert reader.membership.isCustomerHistory();
        assert reader.getInfoString().equalsIgnoreCase("8505132345, Per Persson");
        assert reader.getDateString().equalsIgnoreCase("2019-12-29");

    }
    @Test
    void splitInfoString() {
        // Testar att splitInfoString kan separera en text med både personNr och namn.

        String splitTextInput = "7502031234, Anna Andersson";
        String[] infoStringArray = reader.splitInfoString(splitTextInput);

        assert infoStringArray[0].equals("7502031234");
        assert infoStringArray[1].equals("Anna Andersson");
    }

    @Test
    public void separateDateToInts() {
        // Testar att vi kan separera datumsträng till int som behövs för att testa datum.

        String splitTextInput = "2022-05-03";
        int[] dateStringArray = reader.splitDateString(splitTextInput);

        assert dateStringArray[0] == 2022;
        assert dateStringArray[1] == 5;
        assert dateStringArray[2] == 3;
    }

    @Test
    public void isMember() {
        // Testar att medlemskap med som betalats inom eller = ett år blir aktivt.
        // Testar så att gammalt datum visar inaktivt medlemskap.

        String dateString = (LocalDate.now().toString()); // Dagens datum ska bli rätt (inom 1 år från nu)
        String dateString2 = "2021-10-15"; // ska bli fel (mer än 1 år)
        reader.isMember(dateString);

        assert reader.isMember(dateString);
        assert !reader.isMember(dateString2);
    }

    @Test
    public void readAndWriteDokument() {
        // Testar så att skrift till dokument får rätt dokumentnamn samt rätt text som visar efter läsning.

        String infoString = "7502031234, Anna Andersson"; // input

        // Skriver till fil:
        // Genom metoden writeLog kommer en fil skrivas med filnamnet (Namn - PersonNr).
        // I filen sparas PersonNr, Namn, Besöksdatum - LocalDate.now();
        reader.writeLog(infoString);


        // Läser från skapat dokument:

        //Använder splitInfoString för att separera infoString till Arrays.
        String[] infoStringArray = reader.splitInfoString(infoString);

        try {
            Scanner readFile = new Scanner(new FileReader(infoStringArray[1] + " - " + infoStringArray[0]));

            // Testar att utskriften till filen ger önskat resultat.
            assert readFile.nextLine().equals("Personnr: 7502031234\tNamn: Anna Andersson\tBesöksdatum: " + LocalDate.now());

        } catch (FileNotFoundException e) {
            System.out.println("Kunde inte hitta filen.");
            e.printStackTrace();
        }
    }


    @Test
    public void removeTestFile() {
        // Fungerar ej som den ska i test, utan bara separat.
        // Låter den vara kvar som extra funktion

        String infoString = "7502031234, Anna Andersson";
        String[] infoStringArray = reader.splitInfoString(infoString);

        reader.removeFile(infoStringArray[1], infoStringArray[0]);

    }
    @AfterAll
    public static void avslut() {

        System.out.println("Closing test");
    }

}