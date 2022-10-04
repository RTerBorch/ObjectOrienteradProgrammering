package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program.VäxtNäringEnum;
import org.junit.jupiter.api.Test;

class VäxterTest {

    Växter westernCaktus = new Kaktus(1,"Kaktus");
    Växter CoconutTree = new Palm(1,"Palm");
    Växter MeatEater = new KöttätandeVäxt(1,"Köttätande-växt");


    @Test
    void vattnaMedVad() {
    }

    @Test
    void getDosering() {
    }

    @Test
    void testGetDosering() {
    }

    @Test
    void getNäringFromVäxtNäringEnum() {
        assert MeatEater.getNäring().equals(VäxtNäringEnum.KöttätandeVäxt.getNäringsTyp());
        assert CoconutTree.getNäring().equals(VäxtNäringEnum.Palm.getNäringsTyp());
        assert westernCaktus.getNäring().equals(VäxtNäringEnum.Kaktus.getNäringsTyp());
    }

    @Test
    void getLängd() {
    }

    @Test
    void getNamn() {
    }
}