package year1.javafoundations.solutions.chapter15.exercise6.graphics;

public interface ShapeUtil {
    static void isHigherThanZero(int number, String message) throws NegativeSizeException {
        if(number < 0) throw new NegativeSizeException(message);
    }

    static void isHigherThanZero(int number) throws NegativeSizeException {
        isHigherThanZero(number, "Number is not higher than 0");
    }
}
