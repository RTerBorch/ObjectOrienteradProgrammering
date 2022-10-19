package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.övningsuppgift11;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class VideoTest {

    Video video = new Video(10,10);

    Duration recording = Duration.ofMinutes(65);

    Scanner input = new Scanner(System.in);

    LocalTime ProgramStart = LocalTime.of(9, 0, 0);
    LocalTime ProgramSlut = LocalTime.of(10, 0, 0);

    Duration band = Duration.ofMinutes(65);

    @Test
    public void taInKlockSlag(){


    }

    @Test
    public void whatTime() {
        int hour = 9; // max 24, min 0.
        int minute = 0; // max 60, min 0
        int seconds = 0; // max 60, min 0
    }

    @Test
    public void beräknaTidsSkillnad() {

        // Räknar tid mellan 2 tider
        Duration timeBetween = Duration.between(ProgramStart, ProgramSlut);
        System.out.println(timeBetween);

        // Räknar antal minuter mellan.
        int programLängd = (int) timeBetween.toMinutes();
        System.out.println(programLängd);

        // längden ska bli 60 min
        assert programLängd == 60;
    }

    @Test
    public void fårProgrammetPlatsPåBandet() {

        // får 60min plats på bandet
        int programLängd = 60;
        Duration inspelning1 = Duration.ofMinutes(programLängd);

        System.out.println(band.toMinutes());
        // Parsar band till minuter
        int bandInt = (int) band.toMinutes();

        // jämför om det får plats på band
        assert programLängd < bandInt || programLängd == bandInt;
        System.out.println(bandInt);
    }


}