package year1.basicprogramming.solutions.assignment;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 7/11/2018.
 */
public class exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float amountOfNumbers = 10F;
        int sum = 0;
        for (int i = 0; i < amountOfNumbers; i++) {
            System.out.println("Please enter a number");
            int input = keyboard.nextInt();
            sum += input;
        }
        System.out.println("De som van de gegeven getallen is: " + sum);
        System.out.println("Het gemiddelde van de gegeven getallen is: " + sum/amountOfNumbers);
    }
}
