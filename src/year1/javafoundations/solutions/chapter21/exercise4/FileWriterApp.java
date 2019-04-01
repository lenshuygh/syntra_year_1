package year1.javafoundations.solutions.chapter21.exercise4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class FileWriterApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javafoundations/chapter21/exercise4/";
        final String FILE_NAME = "file.txt";
        final String PATH = DIRECTORY_PATH + FILE_NAME;

        createFileIfNeeded(PATH);


        //try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))){
        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(PATH),StandardOpenOption.APPEND)){
            bufferedWriter.write("Hello Diary,");
            bufferedWriter.newLine();
            bufferedWriter.write("today I learned about io-streams!");
            bufferedWriter.newLine();
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
