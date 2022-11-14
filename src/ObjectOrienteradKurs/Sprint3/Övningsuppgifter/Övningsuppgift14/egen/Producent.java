package ObjectOrienteradKurs.Sprint3.Övningsuppgifter.Övningsuppgift14.egen;

public class Producent implements Runnable {
    public Thread aktivitet = new Thread(this);
    private String text;
    private long intervall;
    private SimpleQueue q;

    public Producent (String text, Long intervall, SimpleQueue q){
        this.text=text;
        this.intervall= intervall * 1000;
        this.q=q;
    }


    @Override
    public void run() {
        while(Thread.interrupted()){
            try {
                Thread.sleep(intervall);
                q.put(text);
            } catch (InterruptedException e){
                break;
            }
        }
    }
}
