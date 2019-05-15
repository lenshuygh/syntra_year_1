package year1.javafoundations.solutions.chapter26.exercise9;

import java.sql.*;
/**
 * Created by JonathanSyntra on 17/05/2017.
 */
public class ResultMetaData {
    public static void main(String[] args) throws SQLException {
        //String sql = "SELECT Id,Name,Price,Stock,Alcohol FROM Beers";

        String sql = "SELECT * FROM Beers";
        //String sql = "update Beers set Stock=100 WHERE Alcohol = 5507";
        int longvarbinary = Types.LONGVARBINARY; //Ignore this type

        System.out.println(sql);
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB", "student", "student123");
             Statement stmt = con.createStatement();) {
            boolean result = stmt.execute(sql);
            if (result) {
                processResultSet(stmt);
            } else {
                processUpdateCount(stmt);
            }
        }
    }

    private static void processUpdateCount(Statement stmt) throws SQLException {
        // Update count
        int count = stmt.getUpdateCount();
        if (count == -1) {
            System.out.println("No results");
        } else {
            System.out.println(count + " records changed");
        }
    }

    private static void processResultSet(Statement stmt) throws SQLException {
        try (ResultSet rs = stmt.getResultSet()) {
            ResultSetMetaData rsmd = rs.getMetaData();

            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                if(rsmd.getColumnType(i) == Types.LONGVARBINARY) {
                    continue;
                }
                int size = rsmd.getColumnDisplaySize(i);
                String name = rsmd.getColumnLabel(i);
                System.out.printf("%-" + size + "s", name);
            }

            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    if(rsmd.getColumnType(i) == Types.LONGVARBINARY) {
                        continue;
                    }
                    int size = rsmd.getColumnDisplaySize(i);
                    String value = rs.getString(i);
                    System.out.printf("%-" + size + "s", value);
                }
                System.out.println();
            }
        }
    }
}
