package year1.javafoundations.solutions.chapter18.exercise3;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class TextPrinterApp {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("Hello this is an example of a sentence containing words");

        System.out.println("*** Word contains 'a' and 'e' ***");
        Predicate<String> predicate1 = s -> s.contains("a");
        Predicate<String> predicate2 = s -> s.contains("e");
        Predicate<String> predicate3 = predicate1.and(predicate2);

        textPrinter.printFilteredWords(predicate3);

        System.out.println("*** Word uppercase reversed ***");
        Function<String,String> function1 = String::toUpperCase;
        Function<String,String> function2 = TextUtil::reverse;
        Function<String,String> function3 = function1.andThen(function2);

        textPrinter.printProcessedWords(function3);
    }
}