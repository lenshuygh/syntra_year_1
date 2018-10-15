package year1.basicprogramming.solutions.chapter4.exercise2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 2/10/2016.
 */
public class HigherLower {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100);
        System.out.println("Enter a number:");
        boolean guessed = false;
        while(!guessed){
            int guess = keyboard.nextInt();
            if(guess < numberToGuess){
                System.out.println("Higher!");
            } else {
                if (guess > numberToGuess){
                    System.out.println("Lower!");
                } else {
                    System.out.printf("Guessed");
                    guessed = true;
                }
            }
        }
    }
}
