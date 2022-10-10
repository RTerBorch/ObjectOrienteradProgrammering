package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3a;

import ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3.Person;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    List<Kurs> inCourse = new ArrayList<>();

    public List<Kurs> getInCourse() {
        return inCourse;
    }

    public void setInCourse(List<Kurs> inCourse) {
        this.inCourse = inCourse;
    }

    public void joinCourse(Kurs kurs) {
        inCourse.add(kurs);
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void printAllClasses() {
        // Skriv ut en elevs alla kurser
        System.out.print("\n" + getName() + ", Går dessa klasser: ");
        if (inCourse.size() == 0) {
            System.out.print("Denna elev har ingen klass");
        } else {
            for (int i = 0; i < inCourse.size(); i++) {
                System.out.print(getInCourse().get(i).getKursNamn() + "\t");
            }
        }
    }

}