package year1.javafoundations.solutions.chapter18.exercise3;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public interface TextUtil {
    static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
