package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.HederligeHarry;

public class BilAnnons extends FordonsAnnons {
    String färg;
    Boolean vinterdäck;
    Boolean sommardäck;

    public BilAnnons(String pris, String rubrik, String beskrivning, String årsModell, String antalMil, String färg, Boolean vinterdäck, Boolean sommardäck) {
        super(pris, rubrik, beskrivning, årsModell, antalMil);
        this.färg = färg;
        this.vinterdäck = vinterdäck;
        this.sommardäck = sommardäck;
    }


    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public Boolean getVinterdäck() {
        return vinterdäck;
    }

    public void setVinterdäck(Boolean vinterdäck) {
        this.vinterdäck = vinterdäck;
    }

    public Boolean getSommardäck() {
        return sommardäck;
    }

    public void setSommardäck(Boolean sommardäck) {
        this.sommardäck = sommardäck;
    }


    @Override
    public void getAnnonsText() {
        System.out.println("Kom och köp " + rubrik + ". " + beskrivning + ".");
        System.out.println("Endast " + pris + "kr! Passa på!");
        System.out.println("Färg: " + färg);
        System.out.println("Årsmodell: " + årsModell);
        System.out.println("Antal körda mil: " + antalMil);

        //vinterdäck
        if (vinterdäck) System.out.println("Vinterdäck: ja");
        else System.out.println("Vinterdäck: nej");
        //sommardäck
        if (sommardäck) System.out.println("Sommardäck: ja");
        else System.out.println("Sommardäck: nej");
    }
}
