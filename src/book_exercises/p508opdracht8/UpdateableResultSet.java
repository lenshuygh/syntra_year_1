package book_exercises.p508opdracht8;

import java.sql.*;

public class UpdateableResultSet {
    public static final String USER = "";
    public static final String PASSWORD = "";
    public static final String CONNECTION_STRING = "jdbc:mysql://noelvaes.eu/StudentDB";
    public static final String MY_QUERY = " select Id, Stock from Beers;";

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(MY_QUERY)) {
            int originalStockValue = 0;
            while(resultSet.next()){
                originalStockValue = resultSet.getInt(2);
                originalStockValue += 50;
                resultSet.updateInt("Stock",originalStockValue);
                resultSet.updateRow();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
