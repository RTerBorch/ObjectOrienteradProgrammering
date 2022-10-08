package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3a;


import static ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift3.KursEnum.Matte;

public class main {

    public static void teacherInput(Kurs kurs, Lärare lärare){

        kurs.setLärare(lärare); // Hans tillsätts som lärare för listan matte
        lärare.putInCourse(kurs); // Matte tillsätts på Hans kurser han lär ut

    }
    public static void studentInput(Kurs Kurs, Student Student){
        Kurs.setElever(Student); // Sigurt tillsätts som elev i listan matte
        Student.joinCourse(Kurs); // Matte tillsätts på Sigurt kurser han går på
    }

    public static void main(String[] args) {

        Student Sigurt = new Student("Sigurt", 18);
        Student Igrun = new Student("Igrun", 19);
        Student Henrietta = new Student("Henrietta", 20);

        Lärare Hans = new Lärare("Magister Hans P Polbirth", 53);
        Lärare Maj = new Lärare("Fröken Maj O Karamell", 34);

        Kurs Matte = new Kurs("Matte");
        Kurs Biologi = new Kurs ("Biologi");

        //fyll kurs matte
        teacherInput(Matte,Maj); // Tillsätter lärare för Kurs, samt lägger klass i lärarens lista.

        studentInput(Matte, Sigurt); // Tillsätter Elev i KursArray, samt lägger kurs i studentens Array
        studentInput(Matte, Igrun);
        studentInput(Matte, Henrietta);

        // Skriver ut alla i matte
        Matte.PrintClass(); // Skriver ut hela klasslistan ersätter raden under
        Biologi.PrintClass();


        // Skriv ut en elevs alla kurser
        System.out.println(Sigurt.getInCourse().toString());
        // Skriv ut en Lärares alla kurser






        // Skriv ut lärarens kurser
       // System.out.println(Hans.getTeachCourse().get(0).getKursNamn());

        // Skriv ut elevernas kurser
    //    System.out.println(Sigurt.getInCourse().get(0).getKursNamn());
     //   System.out.println(Igrun.getInCourse().get(0).getKursNamn());


    }


}
