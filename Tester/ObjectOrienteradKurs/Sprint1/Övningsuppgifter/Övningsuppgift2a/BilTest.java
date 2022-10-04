package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift2a;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilTest {

    public Bil b1 = new Bil(0,
            200, 6,1);

    @Test
    public final void getterText(){
        assert (b1.getAntalVäxlar() == 6);
        assert (b1.getVikt() == 200);
    }

    @Test
    public final void setterText(){
        assert (b1.getAntalVäxlar() == 6);
        b1.setAntalVäxlar(3);
        assert (b1.getAntalVäxlar() == 3);
    }

    @Test
    void getAntalVäxlar() {
    }

    @Test
    void setAntalVäxlar() {
    }

    @Test
    void getVäxelJustNu() {
    }

    @Test
    void setVäxelJustNu() {
    }

    @Test
    void växla() {
    }

    @Test
    void printMe() {
    }
}