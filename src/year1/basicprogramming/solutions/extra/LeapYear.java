package year1.basicprogramming.solutions.extra;

/**
 * Created by JonathanSyntra on 29/10/2018.
 */
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("isLeapYear(-1600)");
        System.out.println(isLeapYear(-1600));
        System.out.println("isLeapYear(1600)");
        System.out.println(isLeapYear(1600));
        System.out.println("isLeapYear(2017)");
        System.out.println(isLeapYear(2017));
        System.out.println("isLeapYear(2000)");
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year){
        /*return year >= 1 && year <= 9999 && ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0);*/
        if(year < 1 || year > 9999){
            return false;
        } else if(year % 100 != 0 && year % 4 == 0) {
            return true;
        } else if(year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
