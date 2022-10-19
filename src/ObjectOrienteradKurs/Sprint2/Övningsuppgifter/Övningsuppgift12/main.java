package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class main {

    public static void main(String[] args) {

        /*
        Fordon b1 = new Bil(10, 200, 6, 1);
        Fordon b2 = new Bil(20, 200, 6, 1);
        Fordon b3 = new Bil(30, 200, 6, 1);
        Fordon b4 = new Bil(40, 200, 6, 1);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Fordon.ser"));

            out.writeObject(b1);
            out.flush();
            out.writeObject(b2);
            out.flush();


        } catch (Exception e) {
            e.printStackTrace();

        }

         */

        try {
           // ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Fordon.ser"));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Fordon.ser"));

        Fordon f = (Fordon)in.readObject();

            System.out.println(f.getHastighet());

            Fordon f2 = (Fordon)in.readObject();

            System.out.println(f2.getHastighet());


        } catch (Exception e) {
            e.printStackTrace();


        }

    }
}
