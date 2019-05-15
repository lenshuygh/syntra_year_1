package year1.javafoundations.solutions.chapter26.exercise11;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by JonathanSyntra on 23/05/2017.
 */
public class SaveImage {
    public static void main(String[] args) {
        Path path = Paths.get("resources/jupiler.gif");
        String sql = "UPDATE Beers SET Image=? WHERE Name=?";
        try (InputStream fi = Files.newInputStream(path);
             Connection con = DriverManager
                     .getConnection("jdbc:mysql://noelvaes.eu/StudentDB",
                             "student", "student123");
             PreparedStatement stmt = con.prepareStatement(sql);) {
            stmt.setBinaryStream(1, fi);
            stmt.setString(2, "Chicago");
            int result = stmt.executeUpdate();
            if (result == 0)
                System.out.println("Not found");
            else
                System.out.println("Image saved");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
