package ObjectOrienteradKurs.Sprint3.Övningsuppgifter.Övningsuppgift14.egen;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        SimpleQueue buf = new SimpleQueue();
        Scanner sc = new Scanner(System.in);

        System.out.println("Antal producenter? ");
        Producent[] p = new Producent[sc.nextInt()];
        for (int i = 0; i< p.length; i++){
            System.out.println("Producent nr " + (i+1) + ": ");
            System.out.println(" Tidsintervall? ");
            System.out.flush();
            int tid = sc.nextInt();

            String txt = sc.next();
            p[i] = new Producent(txt, (long) tid,buf);
        }

        System.out.println("Antal konsumenter ");
        System.out.flush();

        Konsument[] k = new Konsument[sc.nextInt()];
        for(int i = 0; i < k.length; i++){
            System.out.println("Konsument nr " + (i+1) + ":");
            System.out.println("Tidsintervall? ");
            System.out.flush();
            int tid = sc.nextInt();
            k[i] = new Konsument(tid, buf);
        }

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for(int i = 0; i < p.length; i++){
            p[i].aktivitet.start();
        }
        for(int i = 0; i < k.length; i++){
            k[i].aktivitet.start();
        }

        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n antal kvar i kön: " + buf.size());
        System.exit(0);
    }
}
