package book_exercises.p510opdracht11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;

public class UsingLargeObjects {
    public static final String USER = "";
    public static final String PASSWORD = "";
    public static final String CONNECTION_STRING = "jdbc:mysql://noelvaes.eu/StudentDB";
    public static final String MY_SQL = "update Beers set Image = ? where Name = ?";

    public static void main(String[] args) throws FileNotFoundException {
        //Path path = Paths.get("c:\\tormund.jpg");
        FileInputStream fis = new FileInputStream("c:\\tormund_small.jpg");
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(MY_SQL)) {
            preparedStatement.setBlob(1,fis);
            preparedStatement.setString(2,"Grizzly Beer");
            int inserted = preparedStatement.executeUpdate();
                System.out.println("result insert: " + inserted);
            } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
