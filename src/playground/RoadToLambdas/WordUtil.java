package playground.RoadToLambdas;

public interface WordUtil {
    static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
