package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift1abc;

import ObjectOrienteradKurs.Sprint1.LektionDemo.Lektion2.Övningsuppgift1abc.Bil;
import ObjectOrienteradKurs.Sprint1.LektionDemo.Lektion2.Övningsuppgift1abc.Bilägare;
import org.junit.jupiter.api.Test;

class BilTest {

    Bilägare ownertest = new Bilägare("Alfons åberg","Bråkmakargatan 2",18);
    Bilägare ownertest2 = new Bilägare("Gunilla Gorilla","Empire roof",47);
    Bil cartest = new Bil("wad654","Volvo",ownertest);

    @Test
    void ägarByte() {
        assert (cartest.getBilägare().getName().equals(this.ownertest.getName()));
        System.out.println(cartest.getBilägare().getName());
        cartest.ägarByte(ownertest2);
        System.out.println(cartest.getBilägare().getName());
        assert (cartest.getBilägare().getName().equals(this.ownertest2.getName()));
    }
}