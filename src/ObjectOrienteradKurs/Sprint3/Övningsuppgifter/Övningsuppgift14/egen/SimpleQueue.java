package ObjectOrienteradKurs.Sprint3.Övningsuppgifter.Övningsuppgift14.egen;

import java.util.List;
import java.util.Vector;

public class SimpleQueue extends Thread {

private List<Object> list = new Vector<>();

public int size(){
    return list.size();
}

    public synchronized void put ( Object obj){ // antal element i kön
        list.add(obj);
        notify();
    }

    public synchronized Object take(){
    while (list.isEmpty()){
        try{
            wait();
        } catch ( InterruptedException e ) {
            return null;
        }

    }
        Object obj = list.get(0);
        list.remove(0);
        return obj;
    }

}
