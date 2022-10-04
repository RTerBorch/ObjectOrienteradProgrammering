package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift2a;

public class Cykel extends Fordon {
  private  int antalVäxlar;
   private int växelJustNu;

    public int getAntalVäxlar() {
        return antalVäxlar;
    }

    public void setAntalVäxlar(int antalVäxlar) {
        this.antalVäxlar = antalVäxlar;
    }

    public int getVäxelJustNu() {
        return växelJustNu;
    }

    public void setVäxelJustNu(int växelJustNu) {
        this.växelJustNu = växelJustNu;
    }

    public Cykel(int hastighet, int vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public Cykel(int hastighet, int vikt) {
        super(hastighet, vikt);
    }

    public void växla(int nyVäxel) {
        if (nyVäxel > antalVäxlar || nyVäxel < 1) {
            System.out.println("Felaktig växling, växellådan har " + antalVäxlar + " växlar");
        } else {
            System.out.print("Du växlade från " + getVäxelJustNu());
            setVäxelJustNu(nyVäxel);
            System.out.println(" till " + getVäxelJustNu());
        }
    }
    public void printMe() {
        System.out.println("Cykel" + SpeedPlusWeight() + "\nVäxlar: " + antalVäxlar + "\nVäxel nu: " + växelJustNu);
        System.out.println();
    }

}
