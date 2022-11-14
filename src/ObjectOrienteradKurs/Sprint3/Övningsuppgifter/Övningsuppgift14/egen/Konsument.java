package ObjectOrienteradKurs.Sprint3.Övningsuppgifter.Övningsuppgift14.egen;

public class Konsument implements Runnable {
    public Thread aktivitet = new Thread(this);
    private long intervall;
    private SimpleQueue q;

    public Konsument(long intervall, SimpleQueue q) {
        this.intervall = intervall * 1000;
        this.q = q;

    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(intervall);
                System.out.println(q.take() + " ");
                System.out.flush();
            } catch (InterruptedException e) {
                break;
            }
        }

    }
}
