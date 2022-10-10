package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1;

public class Square implements Figure{
    int length;
    int width;

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getCircumference() {
        return length*2 + width*2;
    }
}
