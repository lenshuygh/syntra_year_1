package playground.RoadToLambdas;

public class WordStuff {
    public String secondLetterToUpperCase(String word){
        return word.substring(0,1) + word.substring(1,2).toUpperCase() + word.substring(2);
    }
}
