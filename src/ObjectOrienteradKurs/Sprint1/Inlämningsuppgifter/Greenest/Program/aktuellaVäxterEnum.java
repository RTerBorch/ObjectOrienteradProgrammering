package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program;

public enum aktuellaVäxterEnum {
    iggeEnum(0.2,"Igge"),
    lauraEnum(5,"Laura"),
    meatloafEnum(0.7,"Meatloaf"),
    putteEnum(1,"Putte");

    public double getLängd() {
        return längd;
    }

    public String getNamn() {
        return namn;
    }

    private final double längd;
    private final String namn;

    aktuellaVäxterEnum(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }
}
