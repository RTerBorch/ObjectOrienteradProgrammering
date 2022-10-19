package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.övningsuppgift11;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Scanner;

public class Video {

    int Length;
    int usedUpMinutes;

    public Video(int length, int usedUpMinutes) {
        Length = length;
        this.usedUpMinutes = usedUpMinutes;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int length) {
        Length = length;
    }

    public int getUsedUpMinutes() {
        return usedUpMinutes;
    }

    public void setUsedUpMinutes(int usedUpMinutes) {
        this.usedUpMinutes = usedUpMinutes;
    }
}
