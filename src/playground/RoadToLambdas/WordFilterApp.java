package playground.RoadToLambdas;

public class WordFilterApp {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("Dit is een zin");

        sentence.printValidWord( new WordFilter() {
            @Override
            public boolean isValid(String word) {
                return word.contains("i");
            }
        });
        System.out.println("==============================");
        sentence.printValidWord( new WordFilter() {
            @Override
            public boolean isValid(String word) {
                return word.contains("e");
            }
        });
        System.out.println("==============================");
        sentence.printValidWord( new WordFilter() {
            @Override
            public boolean isValid(String word) {
                return word.length() == 3;
            }
        });
        System.out.println("==============================");
        sentence.printValidWord(new WordFilter() {
            @Override
            public boolean isValid(String word) {
                return word.equals(new String("een"));
            }
        });
        System.out.println("==============================");

        sentence.printTranformedWords(new WordTransformer() {
            @Override
            public String transform(String word) {
                return word.toUpperCase();
            }
        });
        System.out.println("==============================");

        sentence.printTranformedWords(new WordTransformer() {
            @Override
            public String transform(String word) {
                return new StringBuilder(word).reverse().toString();
            }
        });
        System.out.println("==============================");
        sentence.printValidWord(word -> word.contains("i"));
    }

    /*private static void printValidWord(String sentence, WordFilter wordFilter) {
        for (String word : sentence.split(" ")) {
            if (wordFilter.isValid(word)) {
                System.out.println(word);
            }
            ;
        }
    }*/

}
