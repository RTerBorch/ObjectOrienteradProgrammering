package ObjectOrienteradKurs.Sprint4.Övningsuppgifter.Övningsuppgift13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class URLReaderLines {




        public static void main(String[] args) throws IOException {

            URL url = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");

            BufferedReader words = new BufferedReader(
                    new InputStreamReader(url.openStream()));

            Map<Integer, Integer> pocket = words
                    .lines()
                    .collect(Collectors.groupingBy(String::length))
                    .values().stream()
                    .collect(Collectors.toMap(e -> e.get(0).length(), List::size));

            pocket.forEach((k,v) -> System.out.println(k +" "+v));

        }
    }

