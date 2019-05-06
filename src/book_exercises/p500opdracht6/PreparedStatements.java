package book_exercises.p500opdracht6;

import java.sql.*;

public class PreparedStatements {
    public static final String USER = "";
    public static final String PASSWORD = "";
    public static final String CONNECTION_STRING = "jdbc:mysql://noelvaes.eu/StudentDB";

    public static void main(String[] args) {
        String query = "select * from Beers where Alcohol = ?";
        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            DisplayResults(preparedStatement, 6.0f);
            DisplayResults(preparedStatement, 9.0f);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void DisplayResults(PreparedStatement preparedStatement, float alcValue) throws SQLException {
        preparedStatement.setFloat(1, alcValue);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString(2));
            System.out.print("    Alcohol :  ");
            System.out.print(rs.getString(7));
            System.out.println();
        }
        System.out.println("\n-------------------------------------------------");
    }
}
