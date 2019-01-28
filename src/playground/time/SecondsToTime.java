package playground.time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class SecondsToTime {
    public static void main(String[] args) {
        Instant now = Instant.now();
        long nowSeconds = now.getEpochSecond();
        System.out.println(nowSeconds);

        System.out.println("now in beter time: " + calculateTimeThings(nowSeconds));


        System.out.println(ZonedDateTime.now());
    }

    private static String calculateTimeThings(long nowSeconds) {
        String output = "";
        long secondsToPrint = nowSeconds % 60;
        long minutes = nowSeconds / 60;
        long minutesToPrint = minutes % 60;
        long hours = minutes / 60;
        long hoursToPrint = hours % 24;
        long days = hours / 24;
        long daysToPrint = days % 30;
        long yearsToPrint = days / 365;

        long excessDays = days % 365;
        long monthsToPrint = excessDays / 30;
        /*
        long monthsToPrint = months % 12;
        long years = months / 12;
        */
        //long yearsToPrint = months % 12;
        output = output + yearsToPrint + "y - " + monthsToPrint + "m - " + daysToPrint + "d - " + hoursToPrint + ':' + minutesToPrint + ':' + secondsToPrint;
        return output;
    }
}
