package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program.Message;

import javax.swing.*;


public abstract class Växter implements Message {
    // Abstract eftersom klassen växt aldrig instansieras

    // Att inkapsla handlar om att gömma och skydda koden. Man gör detta genom att inkapsla värden med tex private.
    // Dessa går sedan bara komma åt utanför klassen genom Get/Set ( eller protected inom samma mapp ).
    private double längd; // Gjorde inte denna final ifall växten får växa senare.
    private final String namn; // Namnet ska aldrig bytas
    double dosering; // måste vara med så växtarray kan kalla detta utan att värdet blir 0
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
