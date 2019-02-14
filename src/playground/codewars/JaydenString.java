package playground.codewars;

public class JaydenString {
    public static void main(String[] args) {
        System.out.println(toJadenCase(null));
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) {
            return null;
        }
        String[] words = phrase.split(" ");
        String out = "";
        for (String word : words) {
            out += word.substring(0, 1).toUpperCase();
            out += word.substring(1, word.length());
            out += " ";
        }
        return out.substring(0, out.length() - 1);
    }
}
