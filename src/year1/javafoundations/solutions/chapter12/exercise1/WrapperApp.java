package year1.javafoundations.solutions.chapter12.exercise1;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 29/01/2017.
 */
public class WrapperApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = keyboard.next();
        Integer integer = Integer.parseInt(input);
        System.out.println("Input + 2: " + (integer + 2));
/*        System.out.println("Bit count: " + Integer.bitCount(integer));
        System.out.println(Integer.BYTES);*/
    }
}
