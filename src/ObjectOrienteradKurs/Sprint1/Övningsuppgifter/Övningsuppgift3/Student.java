package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    List<String> inCourse = new ArrayList<>();

    public List<String> getInCourse() {
        return inCourse;
    }

    public void setInCourse(List<String> inCourse) {
        this.inCourse = inCourse;
    }

    public Student(String name, int age) {
        super(name, age);

    }
    public void putInCourse(String ämne){
        inCourse.add(ämne);
        setInCourse(inCourse);
    }












}