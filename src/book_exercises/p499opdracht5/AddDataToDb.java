package book_exercises.p499opdracht5;

import java.sql.*;

public class AddDataToDb {
    public static final String USER = "";
    public static final String PASSWORD = "";
    public static final String CONNECTION_STRING = "jdbc:mysql://noelvaes.eu/StudentDB";
    public static final int BREWER_ID = 2;
    public static final int CATEGORY_ID = 36;

    public static final String BEER_SQL = "insert into Beers (Name,BrewerId,CategoryId,Alcohol, Price, Stock) values (%s,%d,%d,%d,%d,%d)";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(CONNECTION_STRING, USER, PASSWORD); Statement statement = connection.createStatement();) {
            int brewerInt = -1;
            String brewerQuery = "select count(id) from Brewers where Id = " + BREWER_ID;
            try(ResultSet brewerResultSet = statement.executeQuery(brewerQuery)) {
                brewerResultSet.next();
                brewerInt = brewerResultSet.getInt(1);
            }

            int categoryInt = -1;
            String categoryQuery = "select count(id) from Category where Id = " + CATEGORY_ID;
            try(ResultSet categoryResultSet = statement.executeQuery(brewerQuery)) {
                categoryResultSet.next();
                categoryInt = categoryResultSet.getInt(1);
            }
            if((brewerInt >= 0) && (categoryInt >= 0)){
                String query = String.format(BEER_SQL, "'LensDark'",BREWER_ID, CATEGORY_ID,22, 14, 60);
                statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet generatedKeysResultSet = statement.getGeneratedKeys();
                while (generatedKeysResultSet.next()) {
                    System.out.println(generatedKeysResultSet.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
