package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1;

import ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1.Circle;
import org.junit.jupiter.api.Test;

class CircleTest {

    Circle ci = new Circle(12);
    @Test
    void getArea() {
        assert Math.round(ci.getArea()) == 113;
        System.out.println(Math.round(ci.getArea()));
    }

    @Test
    void getCircumference() {
        assert Math.round(ci.getCircumference()) == 38;
        System.out.println(Math.round(ci.getCircumference()));
    }

    @Test
    void getRadie() {
        assert Math.round(ci.getRadie()) == 6;
    }
}