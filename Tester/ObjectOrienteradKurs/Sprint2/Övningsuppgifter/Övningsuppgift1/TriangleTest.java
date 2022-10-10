package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1;

import ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1.Triangle;
import org.junit.jupiter.api.Test;

class TriangleTest {
    Triangle ta = new Triangle(5,10);

    @Test
    void getHypotenusanTest(){
     assert Math.round(ta.getHypotenusan()) == 7;
     System.out.println(ta.getHypotenusan());
    }
    @Test
    void getArea() {
    assert Math.round(ta.getArea()) == 25;
        System.out.println(ta.getArea());
    }

    @Test
    void getCircumference() {
       assert Math.round(ta.getCircumference())== 24;
        System.out.println(ta.getCircumference());
    }
}