package ObjectOrienteradKurs.Sprint1.LektionDemo.Lektion1;

public class huvudprogram {

    public static void main(String[] args){


        student s1 = new student(); // alokerar minne, exviterar konstruktor
        s1.setNamn("Kurre");
        s1.setProgram("java22");

        student s2 = new student("kalle");
        student s3 = new student("mimmi","java22");

        System.out.println(s1.getNamn());
        System.out.println(s2.getNamn());
        System.out.println(s3.getNamn());


    }




}
