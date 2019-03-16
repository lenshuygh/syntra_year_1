package book_exercises.p221opdracht5;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimesAndTimezones {
    public static void main(String[] args) {
        ZonedDateTime nowHere = ZonedDateTime.now();
        System.out.printf("Current timezone: %s%n%n",nowHere.getZone());
        System.out.printf("%s%n", ZonedDateTime.now(ZoneId.of("Europe/London")));
        System.out.printf("%s%n", ZonedDateTime.now(ZoneId.of("Australia/Sydney")));
        System.out.printf("%s%n", ZonedDateTime.now(ZoneId.of("Australia/Adelaide")));
        System.out.printf("%s%n", ZonedDateTime.now(ZoneId.of("UTC-4")));
    }
}
