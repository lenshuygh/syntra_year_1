package year1.javafoundations.solutions.chapter12.exercise6;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by JonathanSyntra on 5/02/2017.
 */
public class DurationApp {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1987,8,4);
        LocalDate dateNow = LocalDate.now();
        Period birthDateUntilNowPeriod = birthDate.until(dateNow);

        System.out.println(birthDate);

        System.out.println("Days: " + birthDateUntilNowPeriod.getDays());
        System.out.println("Months: " + birthDateUntilNowPeriod.getMonths());
        System.out.println("Years: " + birthDateUntilNowPeriod.getYears());

        long days = ChronoUnit.DAYS.between(birthDate,dateNow);
        long weeks = ChronoUnit.WEEKS.between(birthDate,dateNow);
        long years = ChronoUnit.YEARS.between(birthDate,dateNow);

        System.out.println("Days: " + days);
        System.out.println("Weeks: " + weeks);
        System.out.println("Years: " + years);
    }
}
