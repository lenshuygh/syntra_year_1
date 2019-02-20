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


        //this all works because the method signature always matches String as param and returns a String as described in WordTransformer

        //method ref on static method
        System.out.println("==============================");
        sentence.printTranformedWords(WordUtil::reverse);


        System.out.println("==============================");
        System.out.println("==============================");

        //method ref on instance
        WordStuff wordStuff = new WordStuff();
        sentence.printTranformedWords(wordStuff::secondLetterToUpperCase);

        sentence.printTranformedWords(String::toLowerCase);
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
