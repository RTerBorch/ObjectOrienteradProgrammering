package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program;

public enum VäxtNäringEnum {

    Kaktus("Mineralvatten"),
    Palm("Kranvatten"),
    KöttätandeVäxt("Proteindryck");



    private final String näringsTyp;
    public String getNäringsTyp() {
        return näringsTyp;
    }

    VäxtNäringEnum(String näringsTyp) {
        this.näringsTyp = näringsTyp;
    }
}
