package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Bankomaten;

public class Lån extends Bank{


    double lånebelopp;
    Personal beviljare;

    public Lån(double ränta, double lånebelopp, Kund ägare, Personal beviljare) {
        super(ränta, ägare);
        this.lånebelopp = lånebelopp;
        this.beviljare = beviljare;

    }

    @Override
    public String toString() {
        return "Lån{" +
                "lånebelopp=" + lånebelopp +
                ", beviljare=" + beviljare +
                ", ränta=" + ränta +
                ", kund=" + kund +
                ", personal=" + personal +
                '}';
    }
}