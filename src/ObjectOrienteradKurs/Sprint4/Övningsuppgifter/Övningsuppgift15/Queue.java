package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift15;

import java.util.List;
import java.util.Vector;

public class Queue <T> implements InterfaceQueue <T>  { // Lägger till T för type, alla olika typer

    private List<T> list = new Vector<>();


    // skriver storlek i kön
    public int size(){
        return list.size();
    }



    public void put(T t){ // sätter in element i kön
        list.add(t);
    }

    public T take(){ // tar element från kön
        T t = list.get(0);
        list.remove(0);
        return t;
    }



}
