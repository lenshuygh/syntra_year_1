package p222opdracht6;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimeDuration {
    public static void main(String[] args) {
        LocalDate myBdate = LocalDate.of(1980,06,23);
        LocalDate now = LocalDate.now();

        Period period = Period.between(myBdate,now);

        long years = period.getYears();
        period = period.minusYears(years);
        long months = period.getMonths();
        period = period.minusMonths(months);
        long days = period.getDays();

        System.out.println("days: " + days);
        System.out.println("months: " + months);
        System.out.println("years: " + years);

        long daysTotal = ChronoUnit.DAYS.between(myBdate,now);
        System.out.println("age in days: " +daysTotal);
        System.out.println("age in weeks: " + ChronoUnit.WEEKS.between(myBdate,now));
        System.out.println("age in moths: " + ChronoUnit.MONTHS.between(myBdate,now));
    }
}
