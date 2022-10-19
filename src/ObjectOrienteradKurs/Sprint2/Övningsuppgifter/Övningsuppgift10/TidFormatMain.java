package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift10;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TidFormatMain {
    public static void main(String[] args) {


        Instant i = Instant.now();
        ZoneId toronto = ZoneId.of("UTC-4");
        ZoneId stockholm = ZoneId.of("GMT");

        ZoneId currentZoneId;
        ZonedDateTime stockholmZonedDateTime = i.atZone(stockholm);
        ZonedDateTime torontoZonedDateTime = i.atZone(toronto);


        System.out.println(stockholmZonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(torontoZonedDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));


    }


}
