package year1.javafoundations.solutions.chapter26.exercise7;

import java.sql.*;

/**
 * Created by JonathanSyntra on 17/05/2017.
 */
public class ChangeStock {
    private static final String SQL1 = "UPDATE Beers SET Stock=100 WHERE Name ='Handsome Juan'";
    private static final String SQL2 = "UPDATE Beers SET Stock=100 WHERE Name ='Piraat'";

    public static void main(String[] args) throws Exception {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://noelvaes.eu/StudentDB",
                "student",
                "student123")) {
            try (Statement stmt = con.createStatement()) {
                con.setAutoCommit(false);   // Take control of transactions
                stmt.executeUpdate(SQL1);   // Transaction start
                stmt.executeUpdate(SQL2);
                //con.rollback();             // Transaction rollback
                con.commit();               // Transaction commit
            } catch (Exception e) {
                con.rollback();             // Transaction rollback
                e.printStackTrace();
            }
        }
    }
}
