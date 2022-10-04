package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program.VäxtNäringEnum;

public class Palm extends Växter {
    double dosering = 0.5 * getLängd(); // assert equals expected

    public double getDosering() {
        return dosering;
    }

    public String getNäring() { // Typ av näring
        return VäxtNäringEnum.Palm.getNäringsTyp();
    }

    public Palm(double längd, String namn) {
        super(längd, namn);
    }


}

