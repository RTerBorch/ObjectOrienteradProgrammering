package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class VäxlaPengarTest {

    VäxlaPengar test1 = new VäxlaPengar();


    List<Valuta> pengarTest = test1.ValutaArray();


    @Test
    public void HurMycketPengarTillbakaTest() {

        test1.setPris(100);
        test1.setMottagenVäxel(200);
        System.out.println(test1.växelTillbaka());

        assert test1.getMottagenVäxel() - test1.getPris() == test1.växelTillbaka();
        assert test1.växelTillbaka() <= test1.getPris();
        assert test1.getMottagenVäxel() >= test1.getPris();
    }
    @Test
    public void billsIsListCorrect(){
        assert pengarTest.get(0).Valör == 1;
        assert pengarTest.get(0).getAntal() == 0;
        pengarTest.get(0).setAntal(1);
        assert pengarTest.get(0).getAntal() == 1;
    }


    @Test
    public void WhatBillToReturn() {
        test1.setPris(1000);
        test1.setMottagenVäxel(2651);
        test1.växelTillbaka();
        test1.ValörAntalTillbaka(pengarTest);
        assert pengarTest.get(7).getAntal() == 1;
        assert pengarTest.get(7).Valör == 1000;
        assert pengarTest.get(6).getAntal() == 1;
        assert pengarTest.get(6).Valör == 500;
        assert pengarTest.get(5).getAntal() == 1;
        assert pengarTest.get(5).Valör == 100;
        assert pengarTest.get(4).getAntal() == 1;
        assert pengarTest.get(4).Valör == 50;
        assert pengarTest.get(3).getAntal() == 0;
        assert pengarTest.get(3).Valör == 20;
        assert pengarTest.get(2).getAntal() == 0;
        assert pengarTest.get(2).Valör == 10;
        assert pengarTest.get(1).getAntal() == 0;
        assert pengarTest.get(1).Valör == 5;
        assert pengarTest.get(0).getAntal() == 1;
        assert pengarTest.get(0).Valör == 1;

    }

        @Test
        public void kronorEllerSedel(){
        // variabel Boolean ärLapp
           assert !pengarTest.get(0).isÄrLapp();
           assert pengarTest.get(7).isÄrLapp();


    }

    @Test
    public void JämnaPengar(){
        test1.setPris(1000);
        test1.setMottagenVäxel(1000);
        test1.växelTillbaka();
        assert test1.isJämnVäxel();
        test1.ValörAntalTillbaka(pengarTest);

    }
}