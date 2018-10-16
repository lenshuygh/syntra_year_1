package year1.basicprogramming.solutions.chapter5.exercise10;

/**
 * Created by JonathanSyntra on 15/10/2016.
 */
public class AssignmentOperator {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 2;
        System.out.println(number1 += number2); //2 8 7
        System.out.println(number1 -= number2); //5
        System.out.println(number1 *= number2); //10
        System.out.println(number1 /= number2); //5 3 0
        System.out.println(number1 %= number2); //1
    }
}
