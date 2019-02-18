package playground.RoadToLambdas;

public class Sentence {
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public void printValidWord(WordFilter wordFilter) {
        for (String word : sentence.split(" ")) {
            if (wordFilter.isValid(word)) {
                System.out.println(word);
            }
        }
    }

    public void printTranformedWords(WordTransformer wordTransformer){
        for(String word : sentence.split(" ")){
            System.out.println(wordTransformer.transform(word));
        }
    }


}
