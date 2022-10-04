package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program;

public enum VäxtNäringEnum {

    Kaktus("Mineralvatten"),
    Palm("Kranvatten"),
    KöttätandeVäxt("Proteindryck");

    public String getNäringsTyp() {
        return näringsTyp;
    }

    public void setNäringsTyp(String näringsTyp) {
        this.näringsTyp = näringsTyp;
    }

    private String näringsTyp;

    VäxtNäringEnum(String näringsTyp) {
        this.näringsTyp = näringsTyp;
    }
}
