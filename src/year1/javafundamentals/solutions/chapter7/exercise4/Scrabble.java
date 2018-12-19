package year1.javafundamentals.solutions.chapter7.exercise4;

import java.util.Scanner;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class Scrabble {
    public static void main(String[] args) {
        int[] pointLookupTable = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = keyboard.nextLine();
        int wordValue = 0;
        int aToInt = 'a';
        for (char character :word.toLowerCase().toCharArray()){
            wordValue += pointLookupTable[character - aToInt];
        }
        System.out.printf("The word value for %s is %d", word, wordValue);
    }
}
