package year1.javafoundations.solutions.chapter18.exercise1;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class TextPrinter {
    private String sentence;

    public TextPrinter(String sentence){
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter){
        for (String w : sentence.split(" ")) {
            if(filter.isValid(w)) {
                System.out.println(w);
            }
        }
    }
}
