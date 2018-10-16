package year1.basicprogramming.solutions.chapter5.exercise15.extra;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 14/10/2018.
 * Maak een programma dat de gebruiker om een getal tussen 1 en 7 (inclusief grenzen) vraagt.
 * Op basis van dit getal druk je de dag van de week af:
 * 1 = maandag …… 7 = zondag.
 * Indien het getal niet tussen 1 en 7 is druk je “Foutief getal” af.
 */
public class Extra1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.println("Geef een getal tussen 1 en 7 (inclusief grenzen):");
        number = keyboard.nextInt();

        String result;
        switch (number){
            case 1: result = "Maandag";
                    break;
            case 2: result = "Dinsdag";
                break;
            case 3: result = "Woensdag";
                break;
            case 4: result = "Donderdag";
                break;
            case 5: result = "Vrijdag";
                break;
            case 6: result = "Zaterdag";
                break;
            case 7: result = "Zondag";
                break;
            default: result = "Foutief getal";
        }

        System.out.println(result);
    }
}
