package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3;

import org.junit.jupiter.api.Test;

import static ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3.KursEnum.Biologi;
import static ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3.KursEnum.Matte;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    //public void putInCourse(KursEnum ämne){
   //     inCourse.add(String.valueOf(ämne));
   // }

    Student tester = new Student("TESTER",01);
    @Test
    void putInCourse() {
    //    putInCourse(Biologi);
        System.out.println(tester.getInCourse().size());
        tester.putInCourse(String.valueOf(Biologi));
        System.out.println(tester.getInCourse().size());
     //   tester.printCourses();
        tester.putInCourse(String.valueOf(Matte));
        System.out.println(tester.getInCourse().size());
       // tester.printCourses();
    }
}