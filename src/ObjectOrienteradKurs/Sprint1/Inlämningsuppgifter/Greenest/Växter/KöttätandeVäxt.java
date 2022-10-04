package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program.VäxtNäringEnum;

public class KöttätandeVäxt extends Växter {

    double dosering = (getLängd() * 0.2) + 0.1;

    public double getDosering() {
        return dosering;
    }
    public String getNäring() { // Typ av näring
        return VäxtNäringEnum.KöttätandeVäxt.getNäringsTyp();
    }

    public KöttätandeVäxt(double längd, String namn) {
        super(längd, namn);
    }

}
