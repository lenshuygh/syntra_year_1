package book_exercises.p292opdracht1;

public class TextPrinter {
    public String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printValidWords(WordFilter wordFilter){
        for (String word : sentence.split(" ")) {
              if(wordFilter.isValid(word)){
                  System.out.println(word);
              }
        }
    }
}
