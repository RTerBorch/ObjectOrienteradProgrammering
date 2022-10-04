package ObjectOrienteradKurs.Sprint1.LektionDemo.Lektion1;

public class student {
    private String namn;
    private String program;



    public student(){

    }
    public student(String namn) { // this om du menar klassens namn
        this.namn = namn;
    }

    public student(String namn, String program) {
        this.namn = namn;
        this.program = program;// kan ha if formler mm i
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}

