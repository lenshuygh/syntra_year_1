package year1.basicprogramming.solutions.chapter5.exercise16;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public class While5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een getal tussen 0 en 10: ");
        int number = keyboard.nextInt();
        while (number < 0 || number > 10){
            System.out.println("Foutief getal! Geef een ander getal: ");
            number = keyboard.nextInt();
        }

        System.out.println("Jouw getal is " + number);
    }
}
