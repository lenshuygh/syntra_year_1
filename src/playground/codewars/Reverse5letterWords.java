package playground.codewars;

public class Reverse5letterWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        String out = "";
        for (String word : words) {
            out += (word.length() > 4) ? new StringBuilder(word).reverse().toString() : word;
            out += " ";
        }
        return out.substring(0, out.length() - 1);
    }
}
