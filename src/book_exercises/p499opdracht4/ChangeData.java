package book_exercises.p499opdracht4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ChangeData {
    public static final String USER = "";
    public static final String PASSWORD = "";
    public static final String CONNECTION_STRING = "jdbc:mysql://noelvaes.eu/StudentDB";
    public static final String SQL = "update Beers set Stock = 50 where Name like '%kriek%'";

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD); Statement statement = connection.createStatement();) {
            System.out.println(statement.executeUpdate(SQL));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
