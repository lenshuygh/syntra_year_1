package examples.algorithms.examples.page41;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerAuto {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numToGuess = random.nextInt(100);
        int counter = 0;



        boolean guessed = false;
        while(!guessed) {
            System.out.println("#"+counter++);
            int guess = random.nextInt(100);
            System.out.println("guessing with -> " + guess);
            if(guess == numToGuess) {
                System.out.println("The number was indeed " + numToGuess);
                guessed = true;
            }else {
                if (guess < numToGuess) {
                    System.out.println("Higher");
                } else {
                    System.out.println("Lower");
                }
            }
        }
        scanner.close();
    }
}
