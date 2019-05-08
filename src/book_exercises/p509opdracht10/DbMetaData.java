package book_exercises.p509opdracht10;

import java.sql.*;

public class DbMetaData {
    public static final String USER = "";
    public static final String PASSWORD = "";
    public static final String CONNECTION_STRING = "jdbc:mysql://noelvaes.eu/StudentDB";
    public static final String MY_QUERY = " select * from Brewers;";

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING,USER,PASSWORD)) {
            DatabaseMetaData dbMetaData = connection.getMetaData();
            System.out.println("DB Version (major): "+dbMetaData.getDatabaseMajorVersion());
            System.out.println("DB Version (minor): "+dbMetaData.getDatabaseMinorVersion());
            System.out.println("transactions support: "+dbMetaData.supportsTransactions());
            System.out.println("DB name: "+dbMetaData.getDatabaseProductName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
