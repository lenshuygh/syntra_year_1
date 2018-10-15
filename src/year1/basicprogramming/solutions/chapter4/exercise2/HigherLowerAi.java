package year1.basicprogramming.solutions.chapter4.exercise2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 2/10/2016.
 */
public class HigherLowerAi {
    public static void main(String[] args) {
        Random rand = new Random();
        int lowerLimit = 0;
        int higherLimit = 100;
        int amountOfGuesses = 0;

        int numberToGuess = rand.nextInt(higherLimit);
        System.out.println("Enter a number:");
        boolean guessed = false;
        while(!guessed){
            amountOfGuesses++;
            int guess = rand.nextInt(higherLimit - lowerLimit) + lowerLimit;
            if(guess < numberToGuess){
                System.out.println("Higher!");
                lowerLimit = guess;
            } else {
                if (guess > numberToGuess){
                    System.out.println("Lower!");
                    higherLimit = guess;
                } else {
                    System.out.printf("Guessed in %s tries", amountOfGuesses);
                    guessed = true;
                }
            }
        }
    }
}
