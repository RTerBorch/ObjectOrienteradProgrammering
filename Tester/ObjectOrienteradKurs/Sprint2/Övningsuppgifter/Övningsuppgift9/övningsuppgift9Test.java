package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift9;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class övningsuppgift9Test {
    String temp;

    int längd;
    List<String> personList = new ArrayList<>();



    @Test
    public void HittaLängden() {
        temp = "Kalle Nilsson, Xvägen 1, 12345 Ystad\n" +
                "25, 80, 175";

        Scanner input = new Scanner(temp);

        while (input.hasNext()) { // Metod putIntoList??
            personList.add(input.next());
        }
        längd = Integer.parseInt(personList.get(8));
        System.out.println(längd);
        assert längd == 175;
    }

    @Test
    public void ÄrLängdenÖverTvåMeter(){

        //assert längd < 200;

    }

    @Test
    public void SparaPersonTillLista(){

    }

    @Test
    public void DelaPersonernaFrånText() {
        temp = "Kalle Nilsson, Xvägen 1, 12345 Ystad\n" +
                "25, 80, 175\n" +
                "Muffin Mattsson, Xvägen 2, 12345 Ystad\n" +
                "25, 68, 201";
        try {
            Scanner input = new Scanner(temp);
            while (input.hasNext()) {
                List<String> tempList = new ArrayList<>();
                for (int i = 0; i <= 8; i++) {


                    tempList.add(input.next());
                    System.out.println(tempList.size());
                    if(tempList.size()==8) {  // resetta efter 8?
                        int tempLängd = Integer.parseInt(tempList.get(8));
                        System.out.println("TEST");
                        if ( tempLängd < 200){
                            System.out.println("Mindre");

                        }
                    }
                }


            }


        } catch (Exception e) {
            System.out.println("FEL");
        }

    }
}




