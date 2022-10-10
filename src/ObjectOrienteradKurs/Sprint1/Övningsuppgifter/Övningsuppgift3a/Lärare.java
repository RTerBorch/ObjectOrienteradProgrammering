package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3a;

import ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3.Person;

import java.util.ArrayList;
import java.util.List;

public class Lärare extends Person {

   List<Kurs> teachCourse = new ArrayList<>();

   List<Kurs> getTeachCourse() {
        return teachCourse;
    }

    public void setTeachCourse(List<Kurs> teachCourse) {
        this.teachCourse = teachCourse;
    }

    public void putInCourse(Kurs kurs) {
        teachCourse.add(kurs);
    }


    public Lärare(String name, int age) {
        super(name, age);
    }


    public void printAllClasses(){
        // Skriv ut en lärares alla kurser
        System.out.print("\n" + getName() + ", är lärare över dessa klasser: ");
        if ( teachCourse.size() == 0){
            System.out.print("Denna lärare har inga kurser");
        } else {
            for (Kurs element : teachCourse) {
                System.out.print(element.getKursNamn() + "\t");
            }
        }
    }

}
