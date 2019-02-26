package year1.javafoundations.solutions.chapter18.exercise2;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public class TextScramble {
    public String scramble(String w){
        //String returnValue = new String(w);
        return w.replace('a','@')
                .replace('e','€')
                .replace('l','1')
                .replace('o','0');
    }
}
