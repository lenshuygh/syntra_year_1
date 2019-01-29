package p219opdracht3;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class TellMeWhatDayThisIs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week as a number: ");
        int dayNumber = Integer.parseInt(scanner.next());
        System.out.println();
        System.out.print("Enter days to add: ");
        long daysToAdd = Long.parseLong(scanner.next());
        System.out.println();
        System.out.println();

        System.out.println(printDay(dayNumber,daysToAdd));

        // teacher solution
        System.out.println("geef dagnummer in : ");
        int dayNum = scanner.nextInt();
        DayOfWeek day = DayOfWeek.of(dayNum);
        System.out.println("geef plus dagen in: ");
        int addDays = scanner.nextInt();
        System.out.println(day.plus(addDays));

    }

    private static String printDay(int dayNumber, long daysToAdd) {
        DayOfWeek startDay = DayOfWeek.of(dayNumber);
        return startDay.plus(daysToAdd).getDisplayName(TextStyle.FULL,Locale.getDefault());
    }
}
