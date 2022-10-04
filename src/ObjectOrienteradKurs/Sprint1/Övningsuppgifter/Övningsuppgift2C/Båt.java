package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift2C;

public class Båt extends Fordon implements Printable{
    private int dödVikt;

    public Båt(int hastighet, int vikt, int dödVikt) {
        super(hastighet, vikt);
        this.dödVikt = dödVikt;
    }

    public String sväng(char turn) {
        turn = Character.toLowerCase(turn);
        switch (turn) {
            case 'v' -> {
                return "Båten svänger vänster";
            }
            case 'h' -> {
                return "Båten svänger höger";
            }
            default -> {
                return "Du måste välja h eller v";
            }


        }
    }

    public void printMe() {
        System.out.println("Båt" + SpeedPlusWeight() + "\nDödvikt: " + dödVikt);
        System.out.println();
    }

}