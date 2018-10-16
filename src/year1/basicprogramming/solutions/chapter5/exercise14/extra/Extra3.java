package year1.basicprogramming.solutions.chapter5.exercise14.extra;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 14/10/2018.
 * <p>
 * Maak een programma dat de gebruiker om een getal vraagt en dan afdrukt of dit getal even of oneven is.
 */
public class Extra3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.println("Geef een getal:");
        number = keyboard.nextInt();

        System.out.println(number % 2 == 0 ? "Even" : "Oneven");
    }
}