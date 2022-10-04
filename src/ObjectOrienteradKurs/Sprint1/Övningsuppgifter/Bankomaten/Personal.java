package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Bankomaten;

public class Personal extends Person{
    int månadsLön;
    public Personal(String namn, String adress, int ålder, String kön, int månadsLön) {
        super(namn, adress, ålder, kön);
        this.månadsLön = månadsLön;
    }
}