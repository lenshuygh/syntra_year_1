package extraexercises.arrays.extra_05_12_18;

import java.util.Scanner;

/*
Maak een methode welke duplicaten out een array van Strings haalt.
Hint: steek in de plaats van de duplicaat een null referentie er in
 */
public class Oefening4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        words = removeDupes(words);
        for (String word : words) {
            System.out.print(word+' ');
        }

        scanner.close();
    }

    private static String[] removeDupes(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; (j < words.length-1); j++) {
                if(words[j].equals(words[i])){
                    words[i] = null;
                }
            }
        }
        return words;
    }
}
