package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1;

import ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift1.Square;
import org.junit.jupiter.api.Test;

class SquareTest {

    Square sq = new Square(2,4);



    @Test
    void getAreaTest() {
        assert sq.getArea() == 8;
        System.out.println(sq.getArea());
    }

    @Test
    void getCircumferenceTest(){
       assert sq.getCircumference() == 12;
        System.out.println(sq.getCircumference());
    }

}