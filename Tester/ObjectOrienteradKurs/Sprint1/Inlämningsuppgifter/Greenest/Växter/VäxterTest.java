package ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Program.VäxtNäringEnum;
import org.junit.jupiter.api.Test;

class VäxterTest {

    Växter westernCaktus = new Kaktus(1, "Kaktus");
    Växter CoconutTree = new Palm(3, "Palm");
    Växter MeatEater = new KöttätandeVäxt(0.5, "Köttätande-växt");


    @Test
    void stämmerDoseringFörVäxt() {
        //En palm behöver 0,5 liter kranvatten per dag * sin längd i meter.
        assert (CoconutTree.getDosering() == 1.5);
        // En köttätandeväxt behöver 0,1l proteindryck per dag + 0,2l per meter.
        assert (MeatEater.getDosering() == 0.2);
        // Kaktusar ska ha 0,02l mineralvatten/dag, oberoende av kaktusens storlek.
        assert  (westernCaktus.getDosering() == 0.02);
    }

    @Test
        // Tar värden från Enum som den ska
    void getNäringFromVäxtNäringEnum() {
        assert MeatEater.getNäring().equals(VäxtNäringEnum.KöttätandeVäxt.getNäringsTyp());
        assert CoconutTree.getNäring().equals(VäxtNäringEnum.Palm.getNäringsTyp());
        assert westernCaktus.getNäring().equals(VäxtNäringEnum.Kaktus.getNäringsTyp());
    }
}
