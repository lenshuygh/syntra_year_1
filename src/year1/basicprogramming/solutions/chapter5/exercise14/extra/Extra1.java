package year1.basicprogramming.solutions.chapter5.exercise14.extra;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 14/10/2018.
 * <p>
 * Maak een programma dat de gebruiker om 2 getallen vraagt, druk “Gelijk“ af als deze gelijk zijn anders “Niet gelijk”.
 */
public class Extra1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Geef een getal:");
        number1 = keyboard.nextInt();
        System.out.println("Geef nog een getal:");
        number2 = keyboard.nextInt();

/*        if(number1 == number2){
            System.out.println("Gelijk");
        } else {
            System.out.println("Niet gelijk");
        }*/
        System.out.println(number1 == number2 ? "Gelijk" : "Niet gelijk");
    }
}