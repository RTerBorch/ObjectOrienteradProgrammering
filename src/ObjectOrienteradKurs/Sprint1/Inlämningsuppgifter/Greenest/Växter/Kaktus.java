package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program.VäxtNäringEnum;

public class Kaktus extends Växter {

    double dosering = 0.02; //(liter)

    public double getDosering() {
        return dosering;
    }
   public String getNäring() { // Typ av näring
        return VäxtNäringEnum.Kaktus.getNäringsTyp();
    }
    public Kaktus(double längd, String namn) {
        super(längd, namn);
    }

        }
