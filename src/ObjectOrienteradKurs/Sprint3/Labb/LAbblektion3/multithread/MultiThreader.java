package ObjectOrienteradKurs.Sprint3.Labb.LAbblektion3.multithread;

public class MultiThreader extends Thread {

    int number;

    public MultiThreader(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(number + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }


}
