package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberEnumsTest {

    @Test
    void StämmerSymbolMedRomerskaVärdet() {
        assert (NumberEnums.romanNum1.value == 1);
        assert (NumberEnums.romanNum5.value == 5);
        assert (NumberEnums.romanNum10.value == 10);
        assert (NumberEnums.romanNum50.value == 50);
        assert (NumberEnums.romanNum100.value == 100);
        assert (NumberEnums.romanNum500.value == 500);
        assert (NumberEnums.romanNum1000.value == 1000);
    }

    @Test
    void StämmerVärdetMedSymbol(){
        assert (NumberEnums.romanNum1.letter.equals("I"));
        assert (NumberEnums.romanNum5.letter.equals("V"));
        assert (NumberEnums.romanNum10.letter.equals("X"));
        assert (NumberEnums.romanNum50.letter.equals("L"));
        assert (NumberEnums.romanNum100.letter.equals("C"));
        assert (NumberEnums.romanNum500.letter.equals("D"));
        assert (NumberEnums.romanNum1000.letter.equals("M"));
    }

}