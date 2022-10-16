package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift8a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class övning8a {
    public static void main(String[] args) {

// Generate list from file
        String temp;
        double lägsta = Double.MAX_VALUE;
        double högsta = Double.MIN_VALUE;

        double total = 0;
        int antalMätnignar = 0;



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
