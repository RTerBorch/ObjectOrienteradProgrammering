package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1;

public class Circle implements Figure {
    int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double getRadie(){
        return diameter/2;
    }

    @Override
    public double getArea() {
        return Math.PI*(getRadie()*getRadie());
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * getRadie();
    }
}
