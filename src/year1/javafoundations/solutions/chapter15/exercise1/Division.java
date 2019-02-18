package year1.javafoundations.solutions.chapter15.exercise1;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 12/02/2017.
 */
public class Division {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numerator = Integer.parseInt(keyboard.nextLine());
        int denominator = Integer.parseInt(keyboard.nextLine());
        int division = numerator / denominator;
        System.out.format("%d / %d = %d",numerator , denominator , division);
    }
}
