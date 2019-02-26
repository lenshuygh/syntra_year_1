package year1.javafoundations.solutions.chapter18.exercise3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class TextPrinter {
    private String sentence;
    private Consumer<String> consumer;

    public TextPrinter(String sentence){
        this(sentence, System.out::println);
    }

    public TextPrinter(String sentence, Consumer<String> consumer){
        this.sentence = sentence;
        this.consumer = consumer;
    }



    public void printFilteredWords(Predicate<String> filter){
        for (String w : sentence.split(" ")) {
            if(filter.test(w)) {
                consumer.accept(w);
            }
        }
    }

    public void printProcessedWords(Function<String,String> processor){
        for (String w : sentence.split(" ")) {
            consumer.accept(processor.apply(w));
        }
    }

    public void printNumbers(Function<String,Double> parser){
        for (String w: sentence.split(" ")) {
            consumer.accept(parser.apply(w).toString());
        }
    }

    public void printSum(Function<String,Double> parser){
        double sum = 0;
        for (String w: sentence.split(" ")){
            try{
                sum += parser.apply(w);
            } catch (NumberFormatException ex){
                //empty
            }
        }
        consumer.accept(String.valueOf(sum));
    }
}
