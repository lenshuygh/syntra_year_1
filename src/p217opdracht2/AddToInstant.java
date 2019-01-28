package p217opdracht2;

import java.time.Instant;

public class AddToInstant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now: " + now);
        System.out.println("result -> " + now.plusSeconds(7).plusMillis(5).plusNanos(3));
    }
}
