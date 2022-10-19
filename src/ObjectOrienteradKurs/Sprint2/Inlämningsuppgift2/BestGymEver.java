package ObjectOrienteradKurs.Sprint2.Inlämningsuppgift2;

import java.util.Scanner;

public class BestGymEver {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        ListReader reader = new ListReader();

        System.out.println("Ange personnr eller förnamn och efternamn.\npersonnr skrivs med 10 tecken yymmddnnnn");

        // Letar igenom efter match genom returnMatch(). Om match hittas finns kund i datafil. CustomaryHistory = true;
        // 2 strängar med kundInfo och kundens betaldatum sparas.
        String userInputString = userInput.nextLine();
        reader.returnMatch(reader.readGymRecords(), userInputString);


        // Om ingen matchning görs är kunden obehörig
        if (!reader.membership.isCustomerHistory()) {
            System.out.println("\nKunden är obehörig, eller så har fel uppgifter angetts.\n");
        }

        // Om matchning gjorts, kontrolleras kundens medlemskap om det fortfarande är aktivt
        // DateString som vi fick genom returnMatch läses in som inparameter till isMember
        // Om betaldatum <= 1år. kund = aktivmedlem.

        // Om ej aktiv medlem
        if (!reader.isMember(reader.getDateString())) {
            System.out.println("\n" + reader.membership.getName() + " har varit medlem, men medlemskapet är inte längre aktivt\n");

            // Om aktiv medlem.
            // Är kundens medlemskap aktivt, loggar vi kundens uppgifter med writeLog.
            // Kundens besök loggas i en separat fil med kundens namn och personNr
        } else if (reader.membership.isCustomerHistory()) {
            reader.writeLog(reader.getInfoString());
            System.out.println("\n" + reader.membership.getName() + " är medlem, besöket har sparats i kundens loggfil\n");
        }

    }


}





