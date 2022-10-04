package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift1abc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Person p1 = new Person("Robin","Tvärgatan 2", 33); // Skapa det längst ner i listan i detta fall bilägare
        Bilägare a1 = new Bilägare("Robin", "Tvärgatan 2", 33);
        Bilägare a2 = new Bilägare("Karin", "gatgatan 2", 55);
        Bilägare a3 = new Bilägare("Tulle", "retgatan 2", 41);


        Bil b1 = new Bil("ghj875",  "Volvo", a1);
        Bil b2 = new Bil("mug837",  "Mercedes", a1);
        Bil b3 = new Bil("hrd875",  "BMW", a2);
        Bil b4 = new Bil("loj875",  "Toyota", a3);

        Bil[] carArray = new Bil[4];
        carArray[0] = b1;
        carArray[1] = b2;
        carArray[2] = b3;
        carArray[3] = b4;

        for (int i = 0; i < carArray.length; i++) {
            System.out.println("Bil: " + (i + 1));
            System.out.println("Märke: " + carArray[i].getMärke());
            System.out.println("Bilägare: " + carArray[i].getBilägare().getName() + "\n"); // lägg märke till Bil.Bilägare
            // eftersom a1 refererar inte till namn utan hela objectet ( namn, adress mm )
        }


        // a2 köper bilen
        System.out.println(carArray[0].getBilägare().getName());
        b1.ägarByte(a2);
        System.out.println(carArray[0].getBilägare().getName());

            /*

            System.out.println(b1.getBilägare().getName());  // måste gå genom bilägere eftersom det är den tar in
            System.out.println(b1.getRegNr());
            System.out.println(b1.getModell());
            System.out.println(b1.getMärke());

            //person a2 köper bilen b1
            b1.setBilägare(a2);

            System.out.println("\n" + b1.getBilägare().getName());  // måste gå genom bilägere eftersom det är den tar in
            System.out.println(b1.getRegNr());
            System.out.println(b1.getModell());
            System.out.println(b1.getMärke());

             */


    }
}
