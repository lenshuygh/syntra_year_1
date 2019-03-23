package recap.enums;

import java.util.Scanner;

public class WeekdayApp {
    public static void main(String[] args) {
        Weekday weekday;

        int num = getNum();

        weekday = getWeekday(num);

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

    private static Weekday getWeekday(int num) {
        Weekday weekday;
        switch (num) {
            case 1:
                weekday = Weekday.MONDAY;
                break;
            case 2:
                weekday = Weekday.TUESDAY;
                break;
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
        return weekday;
    }

    private static int getNum() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a number: ");
        return keyboard.nextInt();
    }
}
