package year1.basicprogramming.solutions.chapter5.exercise14.extra;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 14/10/2018.
 * <p>
 * Maak een programma dat de gebruiker om 3 getallen vraagt. Druk het kleinste getal af.
 */
public class Extra4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        System.out.println("Geef een getal:");
        number1 = keyboard.nextInt();

        System.out.println("Geef nog een getal:");
        number2 = keyboard.nextInt();

        System.out.println("Geef nog een getal:");
        number3 = keyboard.nextInt();

        if(number1 < number2 && number1 < number3){
            System.out.println(number1);
        } else if(number2 < number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
    }
}