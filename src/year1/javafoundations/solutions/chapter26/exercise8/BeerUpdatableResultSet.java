package year1.javafoundations.solutions.chapter26.exercise8;

import java.sql.*;

/**
 * Created by JonathanSyntra on 6/06/2018.
 */
public class BeerUpdatableResultSet {
    private static final String QUERY = "SELECT * FROM Beers WHERE Alcohol = 7";
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB", "student",
                "student123");
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(QUERY)) {

            printAllBeers(con);

            while(rs.next()){
                int currentStock = rs.getInt("stock");
                rs.updateInt("stock", currentStock+50);
                rs.updateRow();
            }

            printAllBeers(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printAllBeers(Connection connection){
        try(Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY)) {
            while (rs.next()) {
                String beerName = rs.getString("Name");
                double alcohol = rs.getDouble("Stock");
                System.out.format("%s %s%n", beerName,
                        alcohol);
            }
            System.out.println("===========================================================================");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
