package year1.basicprogramming.solutions.chapter5.exercise14.extra;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 14/10/2018.
 * <p>
 * Maak een programma dat de gebruiker om 2 getallen vraagt tussen 0 en 10.
 * Als minstens 1 van de 2 getallen 8 of hoger is druk dan “OK” af, met de uitzondering dat als 1 van de 2 getallen 2 of lager is, druk dan “Niet OK” af.
 * Als beide getallen tussen 2 en 8 zijn, druk dan “Bijna OK” af.
 */
public class Extra5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Geef een getal:");
        number1 = keyboard.nextInt();

        System.out.println("Geef nog een getal:");
        number2 = keyboard.nextInt();

        if (number1 <= 2 || number2 <= 2) {
            System.out.println("Niet OK");
        } else if (number1 >= 8 || number2 >= 8) {
            System.out.println("OK");
        } else {
            System.out.println("Bijna OK");
        }
    }
}