package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.övningsuppgift11;

import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Video video = new Video(60, 0);

        System.out.println("Programmets starttid: ");
        LocalTime startTime = LocalTime.parse(input.next());
        System.out.println("Programmets sluttid: ");
        LocalTime slutTid = LocalTime.parse(input.next());


        System.out.println("Starttid " + startTime);
        System.out.println("Sluttid " + slutTid);

        // Programmets längd i minuter, parsas in till int i minuter
        Duration programLength = Duration.between(startTime, slutTid);
        int programLängd = (int) programLength.toMinutes();
        System.out.println(programLängd);

        if (video.getLength() > programLängd) {
            System.out.println("Det går att spela in");
        } else System.out.println("Finns inte plats på band");


    }

}
