package book_exercises.p498opdracht3;

import java.sql.*;

public class SearchBeer2 {

    public static final String USER = "";
    public static final String PASSWORD = "";
    public static final String CONNECTION_STRING = "jdbc:mysql://noelvaes.eu/StudentDB";
    //public static final String CONNECTION_STRING = "jdbc:mysql://noelvaes.eu/StudentDB?useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=CET";
    public static final String q = "select b.id as beerid, b.name as beername, brewerid, br.name as brewer, categoryid, category, price, stock, alcohol, version " +
            "from Beers b " +
            "join Brewers br on br.id = b.brewerid " +
            "join Categories c on c.id = b.categoryid " +
            "order by b.alcohol ";
    public static final String q2 = "select b.id as beerid, b.name as beername, brewerid, br.name as brewer, categoryid, category, price, stock, alcohol, version " +
            "from Beers b " +
            "join Brewers br on br.id = b.brewerid " +
            "join Categories c on c.id = b.categoryid " +
            "where b.alcohol = 6 " +
            "order by b.alcohol ";

    public static void main(String[] args) {
        SearchBeers(q);
        System.out.println("--------------------- alcohol = 6 -----------------------------------------");
        SearchBeers(q2);
    }

    private static void SearchBeers(String query) {


        try (Connection connection = DriverManager.getConnection(
                CONNECTION_STRING, USER, PASSWORD
        ); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query)) {
            System.out.printf("%-6s",resultSet.getMetaData().getColumnLabel(1));
            System.out.print(" |  ");
            System.out.printf("%-60s",resultSet.getMetaData().getColumnLabel(2));
            System.out.print(" |  ");
            System.out.printf("%-21s",resultSet.getMetaData().getColumnLabel(4));
            System.out.print(" |  ");
            System.out.printf("%-15s",resultSet.getMetaData().getColumnLabel(7));
            System.out.print(" |  ");
            System.out.printf("%-10s",resultSet.getMetaData().getColumnLabel(9));
            System.out.println();
            while (resultSet.next()) {

                System.out.printf("%-6d",resultSet.getInt(1));
                System.out.print(" |  ");
                System.out.printf("%-60s",resultSet.getString(2));
                System.out.print(" |  ");
                System.out.printf("%-21s",resultSet.getString(4));
                System.out.print(" |  ");
                /*float price = resultSet.getFloat(7);
                System.out.printf("%-10s",BigDecimal.valueOf(price).toPlainString());*/
                System.out.printf("%-15e",resultSet.getFloat(7));
                System.out.print(" |  ");
                System.out.printf("%-10e",resultSet.getFloat(9));
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Something went wrong...");
            e.printStackTrace(System.err);
        }
    }
}
