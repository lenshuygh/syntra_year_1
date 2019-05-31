package year1.javafoundations.solutions.chapter26.exercise6;

import java.sql.*;

/**
 * Created by JonathanSyntra on 17/05/2017.
 */
public class SearchBeer {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //String sql = "SELECT * FROM Beers WHERE Name=?";
        String sql = "SELECT * FROM Beers WHERE Alcohol=?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://noelvaes.eu/StudentDB", "student", "student123");
             PreparedStatement stmt = con.prepareStatement(sql);) {
/*            stmt.setString(1, "Handsome Juan");
            try (ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    printBeer(resultSet);
                }
            }*/
            for (int i = 5; i <= 10; i++) {
                stmt.setFloat(1, i);
                try (ResultSet resultSet = stmt.executeQuery()) {
                    while (resultSet.next()) {
                        printBeer(resultSet);
                    }
                }
            }
        }
    }

    private static void printBeer(ResultSet resultSet) throws SQLException{
        String beerName = resultSet.getString("Name");
        double alcohol = resultSet.getDouble("Alcohol");
        double price = resultSet.getDouble("Price");
        System.out.println(beerName + " \t " + alcohol + " \t " + price);
        //System.out.println(resultSet.getBlob("Image"));
    }
}
