package year1.javafoundations.solutions.chapter12.exercise5;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * Created by JonathanSyntra on 29/01/2017.
 */
public class ZonedDataTimeApp {
    public static void main(String[] args) {
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZoneId adelaideZone = ZoneId.of("Australia/Adelaide");
        ZoneOffset utcMinus4Offset = ZoneOffset.ofHours(-4);
        ZoneId utc = ZoneId.ofOffset("UTC",utcMinus4Offset);

        ZonedDateTime nowHere = ZonedDateTime.now();
        ZonedDateTime nowLondon = ZonedDateTime.now(londonZone);
        ZonedDateTime nowSydney = ZonedDateTime.now(sydneyZone);
        ZonedDateTime nowAdelaide = ZonedDateTime.now(adelaideZone);
        ZonedDateTime utcMinus4 = ZonedDateTime.now(utc);

        System.out.println(nowHere);
        System.out.println(nowLondon);
        System.out.println(nowSydney);
        System.out.println(nowAdelaide);
        System.out.println(utcMinus4);

        System.out.println(ZonedDateTime.now(ZoneId.of("UTC-4")));
    }
}