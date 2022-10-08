package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3a;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Kurs implements Printout {
    private int index = 0;

    private String kursNamn;
    private Lärare Lärare;

    public Kurs(String kursNamn) {
        this.kursNamn = kursNamn;
    }

    List<Student> elever = new ArrayList<>();

    public String getKursNamn() {
        return kursNamn;
    }

    public void setKursNamn(String kursNamn) {
        this.kursNamn = kursNamn;
    }

    public Lärare getLärare() {
        return Lärare;
    }

    public void setLärare(Lärare lärare) {
        Lärare = lärare;
    }

    public List<Student> getElever() {
        return elever;
    }

    public void setElever(Student student) {
        elever.add(index, student);
        index++;
    }

    @Override
    public void PrintClass() {

        System.out.println(getKursNamn());

        if (getLärare() == null) {
            System.out.println("Lärare: Ingen lärare är tillsatt");
        } else System.out.println("Lärare: " + getLärare().getName());



        if (getElever().size() == 0) {
            System.out.print("Elever: Det finns inga registrerade elever");
        } else {
            System.out.print("Elever: ");
            for (int i = 0; i < getElever().size(); i++) {
                if (getElever().size() == 100) {
                    System.out.println("wdwadawd");
                    System.out.print("Det finns inga elver i denna klass ännu");
                    //   break;
                } else System.out.print(getElever().get(i).getName() + "\t");
            }
        }
        System.out.println("\n");
    }
}
