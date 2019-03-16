package book_exercises.p248opdracht3;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            int numerator = Integer.parseInt(keyboard.nextLine());
            int denominator = Integer.parseInt(keyboard.nextLine());
            int division = numerator / denominator;
            System.out.println(numerator + "/" + denominator + "=" + division);
        } catch (NumberFormatException nfe){
            System.out.println("Invalid number!");
        } catch (ArithmeticException ae){
            System.out.println("Division by 0");
        }
        System.out.println("The end");
    }
}
