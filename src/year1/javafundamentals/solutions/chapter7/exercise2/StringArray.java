package year1.javafundamentals.solutions.chapter7.exercise2;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class StringArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter line of text:");
        String sentence = keyboard.nextLine();
        String[] words = sentence.split(" ");
        for (String s : words) {
            System.out.println(s);
        }
    }
}
