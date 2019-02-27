package p301opdracht3;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class TextPrinterApp {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("Hello this is an example of a sentence containing 10 words 1 2 5");

        System.out.println("*** Reversed words ***");
        textPrinter.printProcessedWords(TextUtil::reverse);

        System.out.println("*** Scrambled words ***");
        TextScramble textScramble = new TextScramble();
        textPrinter.printProcessedWords(textScramble::scramble);
        //textPrinter.printProcessedWords(new TextScramble()::scramble);

        System.out.println("*** Lower case words ***");
        textPrinter.printProcessedWords(String::toLowerCase);

        System.out.println("*** Count numbers ***");
        textPrinter.printSum(Double::new);
    }
}