package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift15;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class QueueNum <Number> implements InterfaceQueue <Number>{


    private List<Number> list = new LinkedList<>();

    public int size(){

        return list.size();
    }

    public void put(Number t){ // antal element i kön
        list.add(t);
    }

    public Number take(){
        Number t = list.get(0);
        list.remove(0);
        return t;
    }

    public String sumNum(){
        String sumNum = "";
        for(int i = 0; i <= this.size()+1; i++){
            sumNum += this.take().toString() + " ";

        }
        return sumNum;
    }

    public double sumSum(){
        String sumNum = "";
        double sumSum = 0;
        for(int i = 0; i <= this.size()+1; i++){
            sumNum += this.take().toString();
            sumSum += Double.parseDouble(sumNum);
            sumNum = "";

        }

        return sumSum;
    }


}



