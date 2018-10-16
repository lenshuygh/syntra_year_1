package year1.basicprogramming.solutions.chapter5.exercise4;

/**
 * Created by JonathanSyntra on 10/10/2016.
 */
public class MathmeticOperations {
    public static void main(String[] args) {
        int number1 = 126;
        int number2 = 569;
        int result;
        char aChar = 'a';

        result = number1 + number2;
        System.out.println("Result = " + result);
        System.out.println("Sum = " + (number1 + number2));
        System.out.println("Difference = " + (number1 - number2));
        System.out.println("Product = " + (number1 * number2));
        System.out.println("Division = " + ((float)number1 / number2));
        System.out.println("Modulo = " + (number1 % number2));
        System.out.println("--number1  = " + --number1);
        System.out.println("number1--  = " + number1--);
        System.out.println("++number1  = " + ++number1);
        System.out.println("number1++  = " + number1++);
        System.out.println(number1);
        System.out.println((aChar + 2));
        System.out.println(aChar + 2);
    }
}
