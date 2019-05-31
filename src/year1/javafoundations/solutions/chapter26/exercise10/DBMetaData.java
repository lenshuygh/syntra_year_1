package year1.javafoundations.solutions.chapter26.exercise10;

import java.sql.*;

/**
 * Created by JonathanSyntra on 17/05/2017.
 */
public class DBMetaData {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB", "student", "student123");) {
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("Database name: " + dbmd.getDatabaseProductName());
            System.out.println("Database version: "
                    + dbmd.getDatabaseProductVersion());
            System.out.println("Driver name: " + dbmd.getDriverName());
            System.out.println("Driver major version: "
                    + dbmd.getDriverMajorVersion());
            System.out.println("Driver minor version: "
                    + dbmd.getDriverMinorVersion());
            System.out.println("Transacties: " + dbmd.supportsTransactions());
            System.out.println("Scrollable resultset: "
                    + dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println("Updateable resultset: "
                    + dbmd.supportsResultSetConcurrency(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE));
            SQLException sqlException = new SQLException("Tis kapoet");
            SQLException sqlException1 = new SQLException("Kapoet door mij");
            sqlException.setNextException(sqlException1);
            sqlException1.setNextException(new SQLException("Ik ben de hoofd oorzaak"));
            throw sqlException;
        } catch (SQLException ex) {
            printError(ex);
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

    private static void printError(SQLException ex) {
        System.out.println("SQL state: " + ex.getSQLState());
        System.out.println("SQL errorcode: " + ex.getErrorCode());
        System.out.println("SQL message:" + ex.getMessage());
        if (ex.getNextException() != null) {
            printError(ex.getNextException());
        }
    }
}
