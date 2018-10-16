package year1.basicprogramming.solutions.chapter5.exercise15.extra;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 14/10/2018.
 * Maak een programma dat de gebruiker om 2 getallen en een rekenkundige operator (+ - * / %) vraagt.
 * Indien het een foutieve ingave van de operator is, druk dan “Foutieve ingave” af.
 * Bereken het resultaat van de getallen gebruik makend van de opgegeven operator.
 * Druk dit resultaat af.
 */
public class Extra2 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        float number1;
        float number2;
        char operator;

        System.out.println("Geef een getal:");
        number1 = keyboard.nextFloat();
        System.out.println("Geef nog een getal:");
        number2 = keyboard.nextFloat();
        System.out.println("Geef een operator (+ - * / %):");
        operator = (char)System.in.read();

        String result = "Het resultaat is ";
        switch (operator) {
            case '+':
                result += number1 + number2;
                break;
            case '-':
                result += number1 - number2;
                break;
            case '*':
                result += number1 * number2;
                break;
            case '/':
                result += number1 / number2;
                break;
            case '%':
                result += number1 % number2;
                break;
            default:
                result = "Foutieve ingave";
        }
        System.out.println(result);
    }
}
