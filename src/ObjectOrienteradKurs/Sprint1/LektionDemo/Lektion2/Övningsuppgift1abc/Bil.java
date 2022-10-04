package ObjectOrienteradKurs.Sprint1.LektionDemo.Lektion2.Övningsuppgift1abc;

public class Bil {
    private String regNr;

    private String märke;
    private Bilägare bilägare;// object bilägare

    public Bilägare getBilägare() {
        return bilägare;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "bilägare=" + bilägare +
                '}';
    }

    public Bil(String regNr, String märke, Bilägare b) {
        this.regNr = regNr;
        this.märke = märke;
        this.bilägare = b;

    }

    public void setBilägare(Bilägare bilägare) {
        this.bilägare = bilägare;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMärke() {
        return märke;
    }

    public void setMärke(String märke) {
        this.märke = märke;
    }



    public void ägarByte(Bilägare a){
        setBilägare(a);
    }


}

