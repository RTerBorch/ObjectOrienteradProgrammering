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
}
