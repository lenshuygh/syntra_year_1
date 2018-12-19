package year1.javafundamentals.solutions.chapter7.extra;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 30/11/2018.
 */
public class Oefening3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a sentence that you want to check for the word \"test\"");
        String sentence = keyboard.nextLine();
        System.out.println("Does this sentence contain the word \"test\":" + containsTest(sentence.split(" ")));
    }

    public static boolean containsTest(String[] words){
        for (String word : words) {
            if("test".equalsIgnoreCase(word)){
                return true;
            }
        }
        return false;
    }
}
