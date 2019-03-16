package book_exercises.p176opdracht1;

import year1.javafundamentals.solutions.chapter9.examples.associations.HigherLowerGame;

import java.util.Scanner;

public class HigherLowerApp {
    public static void main(String[] args) {
        HigherLowerGame higherLowerGame = new HigherLowerGame(20);
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        do {
            System.out.print("Guess- > ");
            int result = higherLowerGame.guess(scanner.nextInt());
            if (result != 0) {
                String msg = (result > 0) ? " lower " : " higher ";
                System.out.println(msg);
            }else {
                System.out.println("FOUND !!");
                found = true;
            }
        } while(!found);
        scanner.close();
    }
}
