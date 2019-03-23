package recap.enums;

import java.util.Scanner;

public class WeekdayApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Weekday weekday;

        System.out.println("enter a number: ");
        int num = keyboard.nextInt();

        switch (num) {
            case 1:
                weekday = Weekday.MONDAY;
                break;
            case 2:
                weekday = Weekday.TUESDAY;
                break
            case 3:
                weekday = Weekday.WEDNESDAY;
                break;
            case 4:
                weekday = Weekday.THURSDAY;
                break;
            case 5:
                weekday = Weekday.FRIDAY;
                break;
            case 6:
                weekday = Weekday.SATURDAY;
                break;
            default:
                weekday = Weekday.SUNDAY;
                break;
        }

        switch (weekday) {
            case MONDAY:
                System.out.println("tis maandag");
                break;
            case SUNDAY:
                System.out.println("zondaaaaag");
                break;
            default:
                System.out.println("ANDERE DAG");
        }
    }
}
