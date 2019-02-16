package year1.javafoundations.solutions.chapter12.exercise4;

import java.time.LocalDate;

/**
 * Created by JonathanSyntra on 29/01/2017.
 */
public class LocalDateTimeApp {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1987,8,4);
        System.out.println("Day of year " + birthDate.getDayOfYear());
        System.out.println("Day of month " + birthDate.getDayOfMonth());
        System.out.println("Day of week " + birthDate.getDayOfWeek());
        System.out.println("Leap year? " + birthDate.isLeapYear());
    }
}
