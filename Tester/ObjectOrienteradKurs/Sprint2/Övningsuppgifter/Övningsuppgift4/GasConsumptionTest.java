package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift4;

import ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift2.gasConsumption;
import org.junit.jupiter.api.Test;

public class GasConsumptionTest {

    gasConsumption2 test1 = new gasConsumption2();


    @Test
    public void räknaBensinFörbrukningPerMil() {
        test1.setFilledGas(100);
        test1.setMeterSettingOneYearAgo(10);
        test1.setMeterSettingToday(50);
        test1.antalKördaMil();

        assert test1.gasConsumptionPerMil() == 2.5;
    }

    @Test
    public void inputIsDouble() {
        //  double a = test1.filledGas;

        test1.inputMeterSettingOneYearAgo();
        System.out.println(test1.getMeterSettingOneYearAgo());
        assert test1.getMeterSettingOneYearAgo() == 10;


        test1.inputMeterSettingToday();
        System.out.println(test1.getMeterSettingToday());
        assert test1.getMeterSettingToday() == 50;


        test1.inputFilledGas();
        System.out.println(test1.getFilledGas());
        assert test1.getFilledGas() == 100;
    }

    @Test
    public void räknaAntalKördaMil() {

        test1.setMeterSettingOneYearAgo(10);
        test1.setMeterSettingToday(50);


        double kördaMil = test1.antalKördaMil();
        System.out.println(kördaMil);
        assert test1.antalKördaMil() == 40;
    }

    @Test
    public void TestaCallInputs(){
        test1.callInputs();

        assert test1.gasConsumptionPerMil() == 2.5;
        assert test1.antalKördaMil() == 40;
    }


}


