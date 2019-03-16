package book_exercises.p297opdracht2;

public interface TextUtil {
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
