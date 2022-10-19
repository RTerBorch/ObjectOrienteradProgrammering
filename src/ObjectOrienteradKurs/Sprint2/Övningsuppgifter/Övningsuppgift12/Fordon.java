package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift12;

import java.io.Serializable;

public abstract class Fordon implements Serializable {
    private int hastighet;
    private int vikt;


    public int getVikt() {
        return vikt;
    }

    public Fordon(int hastighet, int vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    public int getHastighet() {
        return hastighet;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public String SpeedPlusWeight(){
    return "\nHastighet: "+ hastighet + "\nVikt: " + vikt;
    }

    public abstract void printMe();


}
