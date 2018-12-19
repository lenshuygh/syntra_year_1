package year1.javafundamentals.solutions.chapter7.extra;

/**
 * Created by JonathanSyntra on 30/11/2018.
 */
public class Oefening4 {
    public static void main(String[] args) {
        String[] words = {"Please","remove","duplicates","remove","Please"};
        removeDuplicates(words);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void removeDuplicates(String[] words){
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if(currentWord == null){
                continue;
            }
            for (int j = i+1; j < words.length; j++) {
                if(currentWord.equals(words[j])){
                    words[j] = null;
                }
            }
        }
    }
}
