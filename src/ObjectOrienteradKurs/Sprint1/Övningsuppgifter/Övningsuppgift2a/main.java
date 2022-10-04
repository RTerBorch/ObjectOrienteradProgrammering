package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift2a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args){
        List<Fordon> lista = new ArrayList<>(); // skapar arraylist
        // Bil
        System.out.println("Bil");
        Bil b1 = new Bil(0,200,6,1);
        b1.växla(7); // byter till växel inom parantes
        System.out.println("Nuvarande växel: " + b1.getVäxelJustNu());
        lista.add(b1); // lägger till i arraylist


        // Båt
        System.out.println("\nBåt");
        Båt båt1 = new Båt(0,400,100);
        System.out.println(båt1.sväng('v'));
        lista.add(båt1);

        // Tåg
        System.out.println("\nTåg");
        Tåg t1 = new Tåg(0,500, 2);
        System.out.println("Antal vagnar just nu " + t1.getAntalVagnar());
        t1.kopplaVagn();
        System.out.println("Kopplar på en till... Det är nu " + t1.getAntalVagnar() + " vagnar");
        lista.add(t1);

        // Cykel
        System.out.println("\nCykel");
        Cykel c1 = new Cykel(0,20,21,1);
        c1.växla(7); // byter till växel inom parantes
        System.out.println("Nuvarande växel: " + c1.getVäxelJustNu());
        lista.add(c1);


        System.out.println("\nNästa test\n");
        System.out.println();
        for (Fordon fordon : lista) {
            fordon.printMe();

            //for(int i = 0; i < lista.size(); i++){
            //            lista.get(i).printMe();         samma sak

            // arrays List<Fordon> = Arrays.asList(tåg,bil, Cykel, mm);

        }

    }
}
