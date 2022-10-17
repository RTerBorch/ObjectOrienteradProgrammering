package ObjectOrienteradKurs.Sprint2.Inlämningsuppgift2;

import java.util.Scanner;

public class BestGymEver {

    public static void Program() {

        Scanner userInput = new Scanner(System.in);
        ListReader reader = new ListReader();

        System.out.println("Ange personnr eller förnamn och efternamn.\npersonnr skrivs med 10 tecken yymmddnnnn");

        // Letar igenom efter match, ifall match hittas, finns kund i databas CustomaryHistory = true;
        // Samt att 2 strängar med kundInfo och kundens betaldatum sparas.
        // Annars är kunden obehörig och loop avslutas.
        String userInputString = userInput.nextLine();

        reader.returnMatch(reader.readGymRecords(), userInputString);

        // Ifall ingen historik hittas
        if (!reader.membership.isCustomerHistory()) {
            System.out.println("\nKunden är obehörig, eller så har fel uppgifter angetts.\n");

        }

        // Kontrollerar att kundens medlemskap är fortfarande aktivt
        // Om inte bryts loop.
        if (!reader.isMember(reader.getDateString())) {
            System.out.println("\n" + reader.membership.getName() + " har varit medlem, men medlemskapet är inte längre aktivt\n");

        } else if (reader.membership.isCustomerHistory()) {

            // Är kundens medlemskap aktivt, loggar vi kundens uppgifter i egen fil.
            reader.writeLog(reader.getInfoString());
            System.out.println("\n" + reader.membership.getName() + " är medlem, besöket har sparats i kundens loggfil\n");
        }

    }


}





