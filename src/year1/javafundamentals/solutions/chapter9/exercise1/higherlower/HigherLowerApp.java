package year1.javafundamentals.solutions.chapter9.exercise1.higherlower;

import year1.javafundamentals.solutions.chapter9.examples.associations.HigherLowerGame;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 6/01/2019.
 */
public class HigherLowerApp {
    public static void main(String[] args) {
        HigherLowerGame higherLowerGame = new HigherLowerGame(20);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number:");
        int result = -1;
        while (result != 0) {
            int guessValue = keyboard.nextInt();
            result = higherLowerGame.guess(guessValue);

            switch (result) {
                case -1:
                    System.out.println("Higher!");
                    break;
                case 1:
                    System.out.println("Lower!");
                    break;
                case 0:
                    System.out.printf("Guessed");
            }
        }
    }
}
