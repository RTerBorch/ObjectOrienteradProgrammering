package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Register {


    public List<Lärare> allTeachers(){
        Lärare l1 = new Lärare("Magister Hans P Polbirth", 53);
        Lärare l2 = new Lärare("Fröken Prusiluska O Karamell", 34);
        return Arrays.asList(l1,l2);
    }
    public List<Student> allStudents(){
        // Alla studenter på skolan hamnar under allStudents arraylist
        Student p1 = new Student("Sigurt", 18);
        Student p2 = new Student("Igrun", 19);
        Student p3 = new Student("Henrietta", 20);
        Student p4 = new Student("Karlsson", 18);
        Student p5 = new Student("Adam", 18);
        Student p6 = new Student("Ivar", 19);
        Student p7 = new Student("Sara", 20);
        Student p8 = new Student("Kirsti", 18);

        return Arrays.asList(p1,p2,p3,p4);
    }

    public List<Student> mathStudents(){
        // Skapar ny lista lägger till elever från allStudents
        // i samma stund måste eleverna få Matte i deras kurslogg
        List<Student> matteKlassLista = new ArrayList<>();

        matteKlassLista.add(allStudents().get(0));
        matteKlassLista.add(allStudents().get(1));
        matteKlassLista.add(allStudents().get(2));

        return matteKlassLista;

       // System.out.println(matteKlassLista.get(0).getName());
}

    public void printMathStudents(){
        // Skriver ut alla studenter i mathStudents
       for ( Student student : mathStudents()){
           System.out.print(student.getName()+"\t");

       }
        System.out.println("\n");
    }


    /*
    public void printCourses(){
        for (int i = 0; i < allStudents().size(); i++){
            System.out.println(allStudents().get(i).getInCourse().toString());
            System.out.println("dwawd");

        }
        System.out.println();
    }

     */




    // Skollärare
  //  Person l1 = new Lärare("Magister Hans P Polbirth", 53);
   // Person l2 = new Lärare("Fröken Prusiluska O Karamell", 34);

    // Klasslista
   // List<Student> matteKlassLista = new ArrayList<>();
   // List<Student> biologiKlassLista = new ArrayList<>();

    // Skolkurser
   // Kurs matte = new Kurs("Matte",l1,matteKlassLista);
  //  Kurs biologi = new Kurs("Biologi",l2,biologiKlassLista);

    // Lägg in personer i klassrum
   // matteKlassLista = Arrays.asList(p1,p2,p3,p4);
   // biologiKlassLista = Arrays.asList(p1,p2,p3,p4,p5,p6);

/*
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



}
