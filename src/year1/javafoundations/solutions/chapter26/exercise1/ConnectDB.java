package year1.javafoundations.solutions.chapter26.exercise1;

import java.sql.*;

/**
 * Created by JonathanSyntra on 9/05/2017.
 */
public class ConnectDB {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB","student",
                "student123");)  {
            System.out.println("Connection OK");
        } catch (Exception ex) {
            System.out.println("Oops, something went wrong!");
            ex.printStackTrace(System.err);
        }
    }
}
