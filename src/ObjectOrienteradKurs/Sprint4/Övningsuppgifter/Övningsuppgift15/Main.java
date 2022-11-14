package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift15;

public class Main {

    public static void main(String[] args) {

        Queue <String> q = new Queue<>();

        q.put("Hej");
        q.put("Då");


        System.out.println("q size: " + q.size());

        System.out.println("q: " + q.take());
        System.out.println("q: " + q.take());

        System.out.println("q size: " + q.size());


        QueueNum <Number> qNum = new QueueNum<>();

        qNum.put(4);
        qNum.put(4.55);
        qNum.put(1);


        System.out.println(qNum.sumSum());

        /*
        System.out.println("qNum size: " + qNum.size());

        System.out.println("qNum: " + qNum.take());
        System.out.println("qNum: " + qNum.take());
        System.out.println("qNum: " + qNum.take());

        System.out.println("qNum size: " + qNum.size());

        System.out.println(qNum.sumNum());

         */

    }
}
