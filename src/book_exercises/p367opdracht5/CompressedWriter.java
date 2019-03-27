package book_exercises.p367opdracht5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.DeflaterOutputStream;

public class CompressedWriter {
    public static void main(String[] args) {
        final String output = "C:\\data\\folder\\MyFile2.deflated";
        createFileIfNeeded(output);

        try (PrintStream ps = new PrintStream(new DeflaterOutputStream(new FileOutputStream(output)))){
            ps.write("This is a string".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFileIfNeeded(final String PATH) {
        Path path = Paths.get(PATH);

        if(Files.notExists(path)) {
            try {
                Files.createDirectories(path.getParent());
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
