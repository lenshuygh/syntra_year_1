package year1.javafoundations.solutions.chapter26.exercise4;

import java.sql.*;

/**
 * Created by JonathanSyntra on 10/05/2017.
 */
public class ChangeStock {
    public static void main(String[] args) {
        String sql = "UPDATE Beers SET Stock=50 WHERE Name like '%kriek%'";
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB", "student",
                "student123");
             Statement stmt = con.createStatement()) {
            int result = stmt.executeUpdate(sql);
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
