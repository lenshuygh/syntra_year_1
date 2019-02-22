package p297opdracht2;

public class TextPrinter {
    private String sentence;


    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printProcessedWords(WordProcessor wordProcessor){
        for (String s : sentence.split(" ")) {
            System.out.println(wordProcessor.process(s));
        }
    }

    public void printNumberValues(NumberParser parser){
        for (String s : sentence.split(" ")) {
            try {
                System.out.println(parser.parse(s));
            }catch (NumberFormatException n){
                continue;
            }

        }
    }

    public void printSum(NumberParser parser){
        Double d = 0d;
        for (String s : sentence.split(" ")) {
            try {
                d += parser.parse(s);
            } catch(NumberFormatException n){
                continue;
            }
        }
        System.out.println(d);
    }
}
