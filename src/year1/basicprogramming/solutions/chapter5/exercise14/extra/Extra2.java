package year1.basicprogramming.solutions.chapter5.exercise14.extra;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 14/10/2018.
 * <p>
 * Maak een programma dat de gebruiker om een getal tussen 50 (inclusief) en 100 (exlusief) in te geven. Als dit juist is ingegeven druk dan “OK” af, anders druk “Niet OK” af
 */
public class Extra2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.println("Geef een getal tussen 50 (inclusief) en 100 (exlusief):");
        number = keyboard.nextInt();

        if (number >= 50 && number < 100) {
            System.out.println("OK");
        } else {
            System.out.println("Niet OK");
        }
    }
}