package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift13;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// ANVÄNDING AV MAPPER ISTÄLLET FÖR ARRAY. TVÅ INDEX ( KEY : VALUE) ( tex 1 : 2 )
public class UrlReaderMapper {


    public UrlReaderMapper() {

        String temp;
        Map<Integer, Integer> mapper = new HashMap<>();
        int total = 0;

        try {
            URL url = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");

            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()))) {
                while ((temp = in.readLine()) != null) {

                    int size = temp.length();
                    Integer val = mapper.get(size);
                    if (val != null)  //det finns en rad med denna storlek
                    {
                        mapper.put(size, val + 1);
                    } else  //det finns inte någon rad med denna storlek
                    {
                        mapper.put(size, 1);
                    }
                    total++;
                }

                for (Map.Entry<Integer, Integer> entry : mapper.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }

            }
            System.out.println("Totala mängden ord: " + total);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UrlReaderMapper ö = new UrlReaderMapper();
    }
}

