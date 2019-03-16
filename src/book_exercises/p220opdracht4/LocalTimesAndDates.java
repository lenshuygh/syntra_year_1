package book_exercises.p220opdracht4;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalTimesAndDates {
    public static void main(String[] args) {
        LocalDate myBday = LocalDate.of(1980,6,23);
        System.out.printf("Day of the year: %d%n",myBday.getDayOfYear());
        System.out.printf("Day of the month: %d%n",myBday.getDayOfMonth());
        System.out.printf("Day of the week: %s%n",myBday.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.printf("Was this a leapyear? %b%n",myBday.isLeapYear());
    }
}
