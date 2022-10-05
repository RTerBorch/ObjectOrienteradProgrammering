package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program.Message;

import javax.swing.*;


public abstract class Växter implements Message {


    // Att inkapsla handlar om att gömma och skydda koden. Man gör detta genom att inkapsla värden med tex private.
    // Dessa går sedan att komma åt med Get/Set.
    private final double längd;
    private final String namn;
    double dosering;
    String näring; // Typ av näring växt behöver

    public void vattnaMedVad() {
        JOptionPane.showMessageDialog(null, getNamn() + " ska vattnas med " + getDosering() + "L " + getNäring());
    }

    public double getDosering() {
        return dosering;
    }


    public String getNäring() {
        return näring;
    }


    public Växter(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }

    public double getLängd() {
        return längd;
    }

    public String getNamn() {
        return namn;
    }

}
