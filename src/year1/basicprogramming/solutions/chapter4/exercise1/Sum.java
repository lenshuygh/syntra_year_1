package year1.basicprogramming.solutions.chapter4.exercise1;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 2/10/2016.
 */
public class Sum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = keyboard.nextInt(); //input

        System.out.println("Enter another number:");
        int b = keyboard.nextInt(); //input

        int sum = a + b;

        System.out.println("The sum is " + sum); //output
        keyboard.close();
    }
}
