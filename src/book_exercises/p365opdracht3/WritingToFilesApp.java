package book_exercises.p365opdracht3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WritingToFilesApp {
    public static void main(String[] args) {
        System.out.println("writing the file");
        System.out.println("----------------");
        //try (BufferedWriter bWriter = new BufferedWriter(new FileWriter("C:\\data\\folder\\MyFile2.txt"))) {
        try (BufferedWriter bWriter = Files.newBufferedWriter(Paths.get("C:\\data\\folder\\MyFile2.txt"), StandardOpenOption.APPEND)) {
            bWriter.write("Syntra");
            bWriter.write(": ");
            bWriter.write("opdracht 4 p. 365.");

            bWriter.newLine();
            bWriter.write("and with an");
            bWriter.newLine();
            bWriter.write("added ");
            bWriter.newLine();
            bWriter.write("lines.");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
