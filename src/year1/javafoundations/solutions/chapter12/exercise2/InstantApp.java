package year1.javafoundations.solutions.chapter12.exercise2;

import java.time.Instant;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 29/01/2017.
 */
public class InstantApp {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner keyboard = new Scanner(System.in);
        Instant startTime = Instant.now();
        String name = keyboard.nextLine();
        Instant endTime = Instant.now();
        System.out.println("Entering the name " + name +
                " took: " + (endTime.getEpochSecond() - startTime.getEpochSecond()) + " seconds");


        Instant now = Instant.now();
        System.out.println("Before: " + now);
        System.out.println("Added 7 seconds, 5 millis and 3 nanos: " +
                now.plusSeconds(7).plusMillis(5).plusNanos(3));
    }
}
