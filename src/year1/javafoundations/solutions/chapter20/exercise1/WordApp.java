package year1.javafoundations.solutions.chapter20.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JonathanSyntra on 20/03/2017.
 */
public class WordApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        String input;
        do {
            System.out.println("Please enter words, if it ends with a '.' a sentence will be created:");
            input = keyboard.next();
            words.add(input);
        } while (!input.endsWith("."));

        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i));
        }

        System.out.println("Aantal woorden: " + words.size());
        String[] wordsArray = words.toArray(new String[words.size()]);
        for (String word : wordsArray) {
            System.out.println(word);
        }
    }
}
