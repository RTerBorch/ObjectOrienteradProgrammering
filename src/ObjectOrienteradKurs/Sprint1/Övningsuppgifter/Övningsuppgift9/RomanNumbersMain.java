package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Övningsuppgift9;

import ObjectOrienteradKurs.Sprint1.Inlämningsuppgifter.Greenest.Växter.Växter;

import java.util.Arrays;
import java.util.List;

public class RomanNumbersMain {

    public static void main(String[] args){

        RomanNumberClass ett = new RomanNumberClass(NumberEnums.romanNum1.getValue(), NumberEnums.romanNum1.getLetter());
        RomanNumberClass fem = new RomanNumberClass(NumberEnums.romanNum5.getValue(), NumberEnums.romanNum5.getLetter());
        RomanNumberClass tio = new RomanNumberClass(NumberEnums.romanNum10.getValue(), NumberEnums.romanNum10.getLetter());
        RomanNumberClass femtio = new RomanNumberClass(NumberEnums.romanNum50.getValue(), NumberEnums.romanNum50.getLetter());
        RomanNumberClass hundra = new RomanNumberClass(NumberEnums.romanNum100.getValue(), NumberEnums.romanNum100.getLetter());
        RomanNumberClass femhundra = new RomanNumberClass(NumberEnums.romanNum500.getValue(), NumberEnums.romanNum500.getLetter());
        RomanNumberClass tusen = new RomanNumberClass(NumberEnums.romanNum1000.getValue(), NumberEnums.romanNum1000.getLetter());

        List<RomanNumberClass> counter = Arrays.asList(ett,fem,tio,femtio,hundra,femhundra,tusen);


        for ( RomanNumberClass i : counter){
            System.out.println(i.getSymbol()+ " = " + i.getNum());
        }





    }

}
