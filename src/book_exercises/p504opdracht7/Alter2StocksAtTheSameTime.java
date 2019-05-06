package book_exercises.p504opdracht7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Alter2StocksAtTheSameTime {
    public static final String USER = "";
    public static final String PASSWORD = "";
    public static final String CONNECTION_STRING = "jdbc:mysql://noelvaes.eu/StudentDB";

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD)) {
            try(Statement statement = connection.createStatement()){
                connection.setAutoCommit(false);
                statement.executeUpdate("update Beers set stock = 500 where Name = 'Boskeun'");
                statement.executeUpdate("update Beers set stock = 500 where Name = 'LensDark'");
                connection.rollback();
            }catch (Exception e){
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
