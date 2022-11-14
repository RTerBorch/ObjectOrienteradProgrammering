package ObjectOrienteradKurs.Sprint3.Labb.LAbblektion3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class medicinPåminnelse {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);


        System.out.println("Vilken medicin ska du ta?");
        String medicineType = scan.nextLine();
        System.out.println("Hur många gånger i minuten ska medicinen tas?");
        long time = scan.nextLong();

        Skrivare medicine = new Skrivare(medicineType, time);

        medicine.start();

        Thread.sleep(20000);

        medicine.interrupt();



    }


}
