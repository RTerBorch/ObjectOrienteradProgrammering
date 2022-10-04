package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.HederligeHarry;

public abstract class FordonsAnnons {
    String pris;
    String rubrik;
    String beskrivning;
    String årsModell;
    String antalMil;

    public FordonsAnnons(String pris, String rubrik, String beskrivning, String årsModell, String antalMil) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.årsModell = årsModell;
        this.antalMil = antalMil;
    }

    public String getPris() {
        return pris;
    }

    public void setPris(String pris) {
        this.pris = pris;
    }

    public void setRubrik(String rubrik) {
        this.rubrik = rubrik;
    }

    public void setBeskrivning(String beskrivning) {
        this.beskrivning = beskrivning;
    }

    public void setÅrsModell(String årsModell) {
        this.årsModell = årsModell;
    }

    public void setAntalMil(String antalMil) {
        this.antalMil = antalMil;
    }

    public String getRubrik() {
        return rubrik;
    }

    public String getBeskrivning() {
        return beskrivning;
    }

    public String getÅrsModell() {
        return årsModell;
    }

    public String getAntalMil() {
        return antalMil;
    }

    public abstract void getAnnonsText();



    }






