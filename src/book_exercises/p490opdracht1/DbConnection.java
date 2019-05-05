package book_exercises.p490opdracht1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    public static final String USER = "";
    public static final String PASSWORD = "";

    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(
                "jdbc:mysql://noelvaes.eu/StudentDB", USER, PASSWORD
        )){
            System.out.println("Conn OK");
        }catch (Exception e){
            System.out.println("Something went wrong...");
            e.printStackTrace(System.err);
        }
    }
}
