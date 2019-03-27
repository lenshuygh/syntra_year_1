package year1.javafoundations.solutions.chapter21.exercise2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class FileWriterApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javafoundations/chapter21/exercise2/";
        final String FILE_NAME = "file.txt";
        final String PATH = DIRECTORY_PATH + FILE_NAME;

        createFileIfNeeded(PATH);

        try(FileWriter fileWriter = new FileWriter(PATH, true)){
            fileWriter.write("Hello Diary,");
            fileWriter.write(System.lineSeparator());
            fileWriter.write("today I learned about streams!");
            fileWriter.write(System.lineSeparator());
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
