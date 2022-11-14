package ObjectOrienteradKurs.Sprint3.Labb.LAbblektion3;

public class Skrivare extends Thread{


    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getInterval() {
        return interval;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    private long interval;

    public Skrivare(String text, Long interval){
        this.text = text;
        this.interval = (60/interval) * 1000;
    }

    @Override
    public void run() {
        while(!Thread.interrupted()){
            try{
                Thread.sleep(interval);
                System.out.println("Dags för din dos av: " + text);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
                break;
            }
        }
    }



}
