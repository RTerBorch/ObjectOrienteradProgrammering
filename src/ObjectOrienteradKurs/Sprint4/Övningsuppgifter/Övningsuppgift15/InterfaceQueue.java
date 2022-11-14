package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift15;

import java.util.LinkedList;
import java.util.List;

public interface InterfaceQueue<T>  {

    List<Number> list = new LinkedList<>();

    public void put(T t);
    public T take();
    public int size();


}
