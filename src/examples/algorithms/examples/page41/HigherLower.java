package examples.algorithms.examples.page41;

import java.util.Random;
import java.util.Scanner;

public class HigherLower{
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numToGues = random.nextInt(100);
        System.out.println("Enter guesses: ");



        boolean guessed = false;
        while(!guessed) {
            int guess = scanner.nextInt();



            if(guess == numToGues) {
                System.out.println("The number was indeed " + numToGues);
                guessed = true;
            }else {
                if (guess < numToGues) {
                    System.out.println("Higher");
                } else {
                    System.out.println("Lower");
                }
            }
        }
        scanner.close();
    }
}
