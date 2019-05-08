package book_exercises.p514opdracht12;

import java.sql.SQLException;

public class BeerException extends Exception {
    public BeerException(SQLException e) {
        System.out.println("BEER EXCEPTION ! -> ");
        e.printStackTrace();
    }
}
