package ObjectOrienteradKurs.Sprint1.LektionDemo.Lektion2.Övningsuppgift1abc;

public class Person {
    private String name;
    private String adress;
    private int ålder;

    public Person(String name, String adress, int ålder) {
        this.name = name;
        this.adress = adress;
        this.ålder = ålder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }
}
