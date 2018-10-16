package year1.basicprogramming.solutions.chapter5.exercise5;

/**
 * Created by JonathanSyntra on 10/10/2016.
 */
public class MediorDatatypes {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 7;
        byte c = 5 * 7;

        int number1 = 2147483645;
        int number2 = 2147483642;
        int number3 = 50;
        int number4 = 2;
        long result = (long)number1 * number2 + number3 / number4;
        System.out.println(result);
    }
}
