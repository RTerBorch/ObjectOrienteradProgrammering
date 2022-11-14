package ObjectOrienteradKurs.Sprint3.Labb.LAbblektion3.multithread;

public class MultiThreading {

    public static void main(String[] args) {


        for(int i = 1; i <= 4 ; i++){
            MultiThreader myThing = new MultiThreader(i);
            myThing.start();
        }



    }
}
