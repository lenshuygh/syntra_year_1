package year1.javafoundations.solutions.chapter26.exercise12;

/**
 * Created by JonathanSyntra on 23/05/2017.
 */
public class BeerException extends Exception{

    public BeerException() {
        super();
    }

    public BeerException(String message, Throwable cause,
                         boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public BeerException(String message, Throwable cause) {
        super(message, cause);
    }

    public BeerException(String message) {
        super(message);
    }

    public BeerException(Throwable cause) {
        super(cause);
    }

}