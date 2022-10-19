package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift12;

public class Tåg extends Fordon {
    private int antalVagnar;

    public int getAntalVagnar() {
        return antalVagnar;
    }

    public Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public void setAntalVagnar(int antalVagnar) {
        this.antalVagnar = antalVagnar;
    }

    public Tåg(int hastighet, int vikt) {
        super(hastighet, vikt);
    }

    public void kopplaVagn() {

        this.antalVagnar = getAntalVagnar() + 1;
    }


    public void printMe() {
        System.out.println("Tåg" +SpeedPlusWeight() + "\nantal vagnar: " + antalVagnar);
        System.out.println();
    }
}
