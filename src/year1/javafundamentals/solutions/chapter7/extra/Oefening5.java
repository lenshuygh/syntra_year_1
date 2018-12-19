package year1.javafundamentals.solutions.chapter7.extra;

/**
 * Created by JonathanSyntra on 30/11/2018.
 */
public class Oefening5 {
    public static void main(String[] args) {
        String[] words = {null, "Something", null, "else"};
        System.out.println("Length before: " + words.length);
        String[] newWords = removeNulls(words);
        System.out.println("Length after: " + newWords.length);
        for (String newWord : newWords) {
            System.out.println(newWord);
        }
    }

    public static String[] removeNulls(String[] words){
        int countValidWords = 0;
        for (String word : words) {
            if(word != null){
                countValidWords++;
            }
        }
        String[] newWords = new String[countValidWords];
        for (int i = 0, j = 0; i < words.length; i++) {
            if(words[i] != null){
                newWords[j++] = words[i];
            }
        }
        return newWords;
    }
}
