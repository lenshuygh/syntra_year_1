package year1.basicprogramming.solutions.extra;

/**
 * Created by JonathanSyntra on 29/10/2018.
 */
public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println("areEqualByThreeDecimalPlaces(3.7567,3.7568)");
        System.out.println(areEqualByThreeDecimalPlaces(3.7567, 3.7568));
        System.out.println("areEqualByThreeDecimalPlaces(3.757,3.7569999)");
        System.out.println(areEqualByThreeDecimalPlaces(3.757, 3.7569999));
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
        int number1Int = (int)(number1 * 1000);
        int number2Int = (int)(number2 * 1000);
        return number1Int == number2Int;
    }
}
