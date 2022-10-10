package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1;

public class Triangle implements Figure{
    int höjd;
    int bredd;

    public Triangle(int höjd, int bredd) {

        // Likbent
        this.höjd = höjd;
        this.bredd = bredd;
    }

    public double getHypotenusan(){
        double nyBas = bredd/2;
        double sum = (höjd*höjd)+(nyBas*nyBas);
        return Math.sqrt(sum);
    }

    @Override
    public double getArea() {
    return (bredd * höjd) / 2;
    }

    @Override
    public double getCircumference() {
    return  (bredd+ (getHypotenusan()*2));
    }
}
