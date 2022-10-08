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

    public void joinCourse(Kurs kurs){
        inCourse.add(kurs);
    }

    public Student(String name, int age) {
        super(name, age);
    }
}