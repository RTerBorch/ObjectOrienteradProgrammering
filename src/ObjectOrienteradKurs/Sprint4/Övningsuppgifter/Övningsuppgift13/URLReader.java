package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReader {

    public static void main(String[] args) throws Exception {


        URL words = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(words.openStream()));

        String inputLine;
        int totNum = 0;
        int[] fördelning = new int[1000];

        while ((inputLine = in.readLine()) != null) {
            int size = inputLine.length();
            fördelning[size]++;
            totNum++;
        }

        for (int i = 0; i < fördelning.length; i++) {
            if (fördelning[i] != 0){
                System.out.println("Antal ord med " + i+ " bokstäver: " + fördelning[i]);
            }


        }
        System.out.println("Totalt " + totNum + " ord");

    }


}



