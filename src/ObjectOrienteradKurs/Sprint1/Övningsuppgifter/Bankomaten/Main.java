package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Bankomaten;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Personal p1 = new Personal("Frans Janson", "Stenmuern 32",
                45, "Man", 40000);
        Kund k2 = new Kund("Kalle Person", "Vägen 4", 22, "Man");

        ArrayList<Konto> k2Konto = new ArrayList<>();
        Konto konto1 = new Konto(1.2, 1000, k2);
        k2Konto.add(konto1);
        Konto konto2 = new Konto(1.03, 10000, k2);
        k2Konto.add(konto2);


        ArrayList <Lån> k2Lån = new ArrayList<>();
        Lån lån1 = new Lån(1.01, 5000, k2, p1);
        k2Lån.add(lån1);

        k2.printKunduppgifter(k2Lån, k2Konto);



    }
}
