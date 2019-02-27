package p301opdracht3;

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

    public void printProcessedWords(WordProcessor processor){
        for (String w : sentence.split(" ")) {
            System.out.println(processor.process(w));
        }
    }

    public void printNumbers(NumberParser parser){
        for (String w: sentence.split(" ")) {
            System.out.println(parser.parse(w));
        }
    }

    public void printSum(NumberParser parser){
        double sum = 0;
        for (String w: sentence.split(" ")){
            try{
                 sum += parser.parse(w);
            } catch (NumberFormatException ex){
                //empty
            }
        }
        System.out.println(sum);
    }
}
