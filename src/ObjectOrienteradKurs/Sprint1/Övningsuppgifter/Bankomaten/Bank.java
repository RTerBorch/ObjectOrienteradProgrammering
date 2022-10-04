package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Bankomaten;

public class Bank {
        double ränta;
        Kund kund;
        Personal personal;


        public Bank(double ränta, Kund ägare) {
            this.ränta = ränta;
            this.kund = ägare;
        }

        @Override
        public String toString() {
            return "Bank{" +
                    "ränta=" + ränta +
                    ", kund=" + kund +
                    ", personal=" + personal +
                    '}';
        }
    }


