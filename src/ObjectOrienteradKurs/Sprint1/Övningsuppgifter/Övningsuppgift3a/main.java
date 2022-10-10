package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3a;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3.KursEnum.Matte;

public class main {

    public static void teacherInput(Kurs kurs, Lärare lärare){

        kurs.setLärare(lärare); // Hans tillsätts som lärare för listan matte
        lärare.putInCourse(kurs); // Matte tillsätts på Hans kurser han lär ut

    }
    public static void studentInput(Kurs Kurs, Student Student){
        Kurs.setElever(Student); // tillsätter elev i listan matte
        Student.joinCourse(Kurs); // Kurs tillsätts på elev kurser hen går på
    }

    public static void main(String[] args) {

        Student Sigurt = new Student("Sigurt", 18);
        Student Igrun = new Student("Igrun", 19);
        Student Henrietta = new Student("Henrietta", 20);
        List<Student> allStudents = Arrays.asList(Sigurt,Igrun,Henrietta);

        Lärare Hans = new Lärare("Magister Hans P Polbirth", 53);
        Lärare Maj = new Lärare("Fröken Maj O Karamell", 34);
        List<Lärare> allTeachers = Arrays.asList(Hans, Maj);

        Kurs Matte = new Kurs("Matte");
        Kurs Biologi = new Kurs ("Biologi");

        //fyll kurs
        teacherInput(Matte,Maj); // Tillsätter lärare för Kurs, samt lägger klass i lärarens lista.

        studentInput(Matte, Sigurt); // Tillsätter Elev i KursArray, samt lägger kurs i studentens Array
        studentInput(Biologi, Sigurt);

        studentInput(Matte, Igrun);

        studentInput(Matte, Henrietta);

        // Skriver ut alla i matte
        Matte.PrintClass(); // Skriver ut hela klasslistan ersätter raden under
        Biologi.PrintClass();

        // Skriver en students klasser
        Sigurt.printAllClasses();

        // print all students klasser
        for (Student element : allStudents ){
            element.printAllClasses();
        }

        // Skriv ut en Lärares alla kurser
        Maj.printAllClasses();

        // print all teachers klasser
        for (Lärare element : allTeachers){
            element.printAllClasses();
        }

    }
}
