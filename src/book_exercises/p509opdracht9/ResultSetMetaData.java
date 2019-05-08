package book_exercises.p509opdracht9;

import java.sql.*;

public class ResultSetMetaData {
    public static final String USER = "";
    public static final String PASSWORD = "";
    public static final String CONNECTION_STRING = "jdbc:mysql://noelvaes.eu/StudentDB";
    public static final String MY_QUERY = " select * from Brewers;";

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(MY_QUERY)) {
            processMetaData(resultSet);
            processResults(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void processResults(ResultSet resultSet) throws SQLException {
        while(resultSet.next()) {
            System.out.printf("%n");
            for (int i = 1; i < resultSet.getMetaData().getColumnCount(); i++) {
                if (resultSet.getMetaData().getColumnTypeName(i).equals("VARCHAR")) {
                    System.out.printf("|%-30s", resultSet.getString(i));
                }
            }
        }
    }

    private static void processMetaData(ResultSet resultSet) throws SQLException {
        /*
        type to ignore = Types.LONGVARBINARY
         */
        for (int i = 1; i < resultSet.getMetaData().getColumnCount(); i++) {
            if(resultSet.getMetaData().getColumnTypeName(i).equals("VARCHAR")){
                System.out.printf("|%-30s",resultSet.getMetaData().getColumnLabel(i));
            }
        }
    }
}
