package year1.javafoundations.solutions.chapter18.exercise1;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class TextPrinterApp {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("Hello this is an example of a sentence containing words");

        System.out.println("*** Words containing 'e' ***");
        textPrinter.printFilteredWords(s -> s.contains("e"));

        System.out.println("*** Long words ***");
        textPrinter.printFilteredWords(s -> s.length() > 4);

        System.out.println("*** Words starting with 'a' ***");
        textPrinter.printFilteredWords(s -> s.startsWith("a"));

        System.out.println("*** Words with second letter 'e' ***");
        textPrinter.printFilteredWords(s -> s.length() > 1 && 'e' == s.charAt(1));

        System.out.println("*** Contains the letter 'e' twice ***");
        textPrinter.printFilteredWords(s -> {
            int eCount = 0;
            for (char c : s.toCharArray()) {
                if('e' == c) {
                    eCount++;
                }
            }
            return eCount == 2;
        });
    }
}