package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift8a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class huvudprogram {
    public static void main(String[] args) {


        String temp;
        double lägsta = 1000;
        double högsta = 0;

        double total = 0;
        int antalMätnignar = 0;
        List<Integer> lista;


        try {
            BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\robin\\Desktop\\IntelliJ\\ObjectOrienteradProgrammering\\src\\ObjectOrienteradKurs\\Sprint2\\Övningsuppgifter\\Övningsuppgift8a\\temp.txt"));
            while ((temp = read.readLine()) != null){
                temp = temp.replace(",",".");
                total+=Double.parseDouble(temp);
                antalMätnignar++;
                if (Double.parseDouble(temp) > högsta){
                    högsta = Double.parseDouble(temp);
                }
                if(Double.parseDouble(temp) < lägsta){
                    lägsta = Double.parseDouble(temp);
                }
            }

        } catch (Exception e) {
            System.out.println("FEL");
            e.printStackTrace();
        }

        System.out.println("Högsta: " + högsta);
        System.out.println("Lägsta: " + lägsta);

        // Gör metod av dessa
        System.out.println("Total " + total);
        System.out.println("Medeltemp: " + (total/antalMätnignar));
    }
}



