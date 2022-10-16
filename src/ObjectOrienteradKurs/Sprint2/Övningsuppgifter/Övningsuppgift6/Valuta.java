package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift6;

import java.util.Arrays;
import java.util.List;

public class Valuta {
    public boolean isÄrLapp() {
        return ärLapp;
    }

    public Valuta(int valör, int antal, boolean ärLapp) {
        this.Valör = valör;
        this.ärLapp = ärLapp;
        this.antal = antal;
    }

    final int Valör;
    private int antal;

    private boolean ärLapp;

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }






}
