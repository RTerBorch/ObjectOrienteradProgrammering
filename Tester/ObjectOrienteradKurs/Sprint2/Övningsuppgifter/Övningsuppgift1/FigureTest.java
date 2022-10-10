package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1;

import ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1.Figure;
import org.junit.jupiter.api.Test;

class FigureTest {
Figure a = new Figure() {
    @Override
    public double getArea() {
        return 0;
    }


    @Override
    public double getCircumference() {
        return 0;
    }
};

 @Test
 public void getAreaTest() {
     assert a.getArea() == 0;
 }


}