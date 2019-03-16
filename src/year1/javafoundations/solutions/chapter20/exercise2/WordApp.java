package year1.javafoundations.solutions.chapter20.exercise2;

import java.util.*;

/**
 * Created by JonathanSyntra on 20/03/2017.
 */
public class WordApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a full sentence: ");
        String sentence = keyboard.nextLine();

        Collection<String> stringList = new HashSet<>();
        String[] split = sentence.split(" ");
        for (String s : split) {
            stringList.add(s);
        }

        System.out.println("Aantal woorden: " + stringList.size());
        String[] words = stringList.toArray(new String[stringList.size()]);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
