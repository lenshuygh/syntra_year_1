package year1.javafundamentals.solutions.chapter7.extra;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 30/11/2018.
 */
public class Oefening6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a sentence of which we need to remove the duplicates:");
        String sentence = keyboard.nextLine();
        String[] words = sentence.split(" ");
        Oefening4.removeDuplicates(words);
        String[] newWords = Oefening5.removeNulls(words);

        StringBuilder sb = new StringBuilder();
        for (String newWord : newWords) {
            sb.append(newWord).append(" ");
        }
        System.out.println(sb);
    }
}
