package year1.javafoundations.solutions.chapter12.exercise3;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 29/01/2017.
 */
public class DayOfWeekApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een dag in week (1-7):");
        int dayOfTheWeek = keyboard.nextInt();
        DayOfWeek inputtedDay = DayOfWeek.of(dayOfTheWeek);
        System.out.println("Hoeveel dagen wil je hierbij optellen?");
        int amountOfDaysToAdd = keyboard.nextInt();
        DayOfWeek addedDayResult = inputtedDay.plus(amountOfDaysToAdd);
        System.out.println(addedDayResult);
        //System.out.println(addedDayResult.getDisplayName(TextStyle.FULL,new Locale("nl","BE")));
        System.out.println(addedDayResult.getDisplayName(TextStyle.FULL,Locale.getDefault()));
    }
}
