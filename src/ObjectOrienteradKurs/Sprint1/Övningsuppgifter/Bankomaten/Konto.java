package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Bankomaten;

public class Konto extends Bank {
    double saldo;


    public Konto(double ränta, double saldo, Kund kontoÄgare) {
        super(ränta, kontoÄgare);
        this.saldo = saldo;

    }

    @Override
    public String toString() {
        return "Konto{" +
                "saldo=" + saldo +
                ", ränta=" + ränta +
                ", kund=" + kund +
                ", personal=" + personal +
                '}';
    }
}