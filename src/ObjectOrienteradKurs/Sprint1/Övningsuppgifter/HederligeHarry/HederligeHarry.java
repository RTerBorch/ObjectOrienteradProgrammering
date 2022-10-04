package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.HederligeHarry;

public class HederligeHarry {

    public static void main(String[] args) {

        BilAnnons car1 = new BilAnnons("34 500", "Unkarls-Pärlan", "snabb bil med nya stripes som får damerna att bli tokiga.",
                "1985", "20 000", "blå", false, true);
        car1.getAnnonsText();

        System.out.println();

        BilAnnons car2 = new BilAnnons("40 000", "Behändig och pålitlig",
                "Visst hittar man rost här och var, men bilen stannar inte för det (Bromsar ej bytta).", "1960",
                "130 000", "Svart", true, true);
        car2.getAnnonsText();
    }
}
