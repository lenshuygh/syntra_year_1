package p301opdracht3;

/**
 * Created by JonathanSyntra on 5/03/2017.
 */
public interface TextUtil {
    static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
