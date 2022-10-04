package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift2CD;

public class Cykel extends Fordon implements Printable, Hjulburen{
    int antaHjul = 2;
  private  int antalVäxlar;
   private int växelJustNu;

    public int getHjul() {
        return antaHjul;
    }

    public void setHjul(int hjul) {
        this.antaHjul = hjul;
    }

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

    }


    public void printAntalHjul() {
        System.out.println("Cykel har " + antaHjul + " Hjul");
        System.out.println();
    }


}
