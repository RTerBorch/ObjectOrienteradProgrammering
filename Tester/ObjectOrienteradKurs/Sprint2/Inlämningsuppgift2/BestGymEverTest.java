package ObjectOrienteradKurs.Sprint2.Inlämningsuppgift2;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.Scanner;

class BestGymEverTest {
    String infoString = "";
    String dateString = "";
    String testInput = "";

    Membership membership = new Membership();
    ListReader ListReader = new ListReader();

/*
    @Test
    public void TextTillTvåSträngar() {
        // 7608021234, Diamanda Djedi - 2022-01-30

  //      testInput = ListReader.userInputToUpperCase("Diamanda Djedi");
        // testInput = ListReader.userInputToUpperCase("7608021234");

        assert ListReader.findCustomer(testInput); // hittat match på kund
        assert ListReader.getInfoString().equals("7608021234, DIAMANDA DJEDI"); // rad 1 stämmer
        assert ListReader.getDateString().equals("2022-01-30"); // rad 2 stämmer
    }

    @Test
    public void skrivDatumFrånSträngtillTreInt() {
        Scanner input = new Scanner("7502031234, Anna Andersson\n" +
                "2022-12-13");

        while (input.hasNext()) {
            String temp1 = input.nextLine();
            String datum = input.nextLine();


            int year = Integer.parseInt(datum.substring(0, 4));
            int månad = Integer.parseInt(datum.substring(5, 7));
            int dag = Integer.parseInt(datum.substring(8, 10));
            assert datum.equals("2022-12-13");
            System.out.println(datum);
            assert year == 2022;
            System.out.println(year);
            assert månad == 12;
            System.out.println(månad);
            assert dag == 13;
            System.out.println(dag);


        }


    }

    @Test
    public void everBeenAMember() {

     //   testInput = ListReader.userInputToUpperCase("Diamanda Djedi");// user input
        assert ListReader.findCustomer(testInput); // Letar match och ger true ifall hittad.
        Membership membership = ListReader.getMembership(); // Tar in membership skapad i ListReader.
        assert membership.isCustomerHistory(); // Ser ifall denna kund någonsin varit medlem

    }

    @Test
    public void OmKundHittasSparasInfo() { // Bryter ner

    //    testInput = ListReader.userInputToUpperCase("Diamanda Djedi");// user input
        assert ListReader.findCustomer(testInput); // Letar match och ger true ifall hittad.
        Membership membership = ListReader.getMembership(); // Tar in membership skapad i ListReader.




        try {
            Scanner input = new Scanner(new FileReader("src/ObjectOrienteradKurs/Sprint2/Övningsuppgifter/Övningsuppgift9/personlista.txt"));

                /*"7502031234, Anna Andersson\n" +
                "2022-05-03\n" +
                "8505132345, Per Persson\n" +
                "2019-12-29");


            System.out.println(ListReader.getInfoString());

            if (infoString.contains("Anna Andersson")) {
                //membership.setName();

                assert dateString.equals("2022-05-03");
            }

            while (input.hasNextLine()) {
                infoString = input.nextLine();
                dateString = input.nextLine();

                // Om Matchning görs på detta namn, kolla om datum matchar med kundens
                // Metod: Ta in firstString & secondString.
                // Om firstString contains input, använd metod för att kolla datum ifall medlemskap akrivt.
                // Annars kunden har inte varit kund sen innan.

                if (infoString.contains("Anna Andersson")) {
                    System.out.println("Hittat Anna: " + infoString + " " + dateString);
                    assert dateString.equals("2022-05-03");
                }
                if (infoString.contains("Per Persson")) {
                    System.out.println("Hittat Per: " + infoString + " " + dateString);
                    assert dateString.equals("2019-12-29");
                }

                // Om Matchning görs på detta personNr, kolla om datum matchar med kundens
                if (infoString.contains("7502031234")) {
                    System.out.println("Hittat 7502031234: " + infoString + " " + dateString);
                    assert dateString.equals("2022-05-03");
                }
                if (infoString.contains("8505132345")) {
                    System.out.println("Hittat 8505132345: " + infoString + " " + dateString);
                    assert dateString.equals("2019-12-29");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void SkrivTestAvDatum() {
        // Dagens datum
        LocalDate datum = LocalDate.now();
        System.out.println(datum);
        // Datum för ett år sedan
        LocalDate datum2 = LocalDate.of(datum.getYear() + 1, 10, 14);
        System.out.println(datum2);


    }




    @Test
    public void ärMedlemskapetFortfarandeAktivt() {

        LocalDate idag = LocalDate.now();
        LocalDate datum = LocalDate.of(2022, 9, 14);

        boolean MoreThanOneYearAgo = datum.isBefore(idag.minusYears(1));

        if (!MoreThanOneYearAgo) {
            System.out.println("Du är medlem");
        } else {
            System.out.println("Ditt Medlemskap har utgått");
        }
    }

    @Test
    public void testtest(){

    }


 */
}