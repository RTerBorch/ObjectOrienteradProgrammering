package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Register reg = new Register();

       // reg.allStudents().get(0).putInCourse(String.valueOf(KursEnum.Matte));
        //reg.allStudents().get(0).printCourses();
        reg.printMathStudents();



        /*
        Student p1 = new Student("Sigurt", 18);
        Student p2 = new Student("Igrun", 19);
        Student p3 = new Student("Henrietta", 20);
        Student p4 = new Student("Karlsson", 18);
        Student p5 = new Student("Adam", 18);
        Student p6 = new Student("Ivar", 19);
        Student p7 = new Student("Sara", 20);
        Student p8 = new Student("Kirsti", 18);

        // Skollärare
        Person l1 = new Lärare("Magister Hans P Polbirth", 53);
        Person l2 = new Lärare("Fröken Prusiluska O Karamell", 34);

        // Klasslista
        List<Student> matteKlassLista = new ArrayList<>();
        List<Student> biologiKlassLista = new ArrayList<>();

        // Skolkurser
        Kurs matte = new Kurs("Matte",l1,matteKlassLista);
        Kurs biologi = new Kurs("Biologi",l2,biologiKlassLista);

        // Lägg in personer i klassrum
        matteKlassLista = Arrays.asList(p1,p2,p3,p4);
        biologiKlassLista = Arrays.asList(p1,p2,p3,p4,p5,p6);


        // Matte
        System.out.println("Lärare:\t" + matte.getLärare().getName());
        System.out.println("Kurs:\t" + matte.getKurs());
        System.out.print("Elever\t");
        for (Student element : matteKlassLista) {
            System.out.print(element.getName()+"\t");
        }
        System.out.println("\n");

        // Biologi
        System.out.println("Lärare:\t" + matte.getLärare().getName());
        System.out.println("Kurs:\t" + matte.getKurs());
        System.out.print("Elever\t");
        for(Student element : biologiKlassLista){
            System.out.print(element.getName() + "\t");
        }

         */



/*
        List<Student> matteElever = new ArrayList<>();
        matteElever.add(p1);


        // Skolkurser
        Kurs matte = new Kurs("Matte",l1,matteElever);
        p1.addToCourse(matte);


        // Biologi
        List<Student> StudentList1 = Arrays.asList(p1, p2, p3, p4, p8); // klasslista
        Kurs k1 = new Kurs("Biologi", l1, StudentList1);








        // Utskrift Biologi klasslista
        System.out.println("Ämne: " + k1.getKurs());
        System.out.println("Lärare: " + k1.lärare.getName());
        System.out.print("Elever: ");
        for (int i = 0; i < StudentList1.size(); i++) {
            System.out.print(k1.getStudentList().get(i).getName().toString());
            if (i != StudentList1.size() - 1) {
                System.out.print(", ");
            } else if (i == StudentList1.size() - 1) {
                System.out.println("\n");
            }
        }

        // Matte
        List<Student> StudentList2 = Arrays.asList(p5, p1, p3, p4, p8, p6, p7);
        Kurs k2 = new Kurs("Matte", l2, StudentList2);

        // Utskrift Matte

        System.out.println("Ämne: " + k2.getKurs());
        System.out.println("Lärare: " + k2.lärare.getName());
        System.out.print("Elever: ");
        for (int i = 0; i < StudentList2.size(); i++) {
            System.out.print(k2.getStudentList().get(i).getName().toString());
            if (i != StudentList2.size() - 1) {
                System.out.print(", ");
            } else if (i == StudentList2.size() - 1) {
                System.out.println("\n");
            }
        }
        k1.setLärare(l2);
        System.out.println(k1.getLärare().getName());

 */
    }


}
