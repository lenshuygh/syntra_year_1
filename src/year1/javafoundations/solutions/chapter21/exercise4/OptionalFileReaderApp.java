package year1.javafoundations.solutions.chapter21.exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class OptionalFileReaderApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javafoundations/chapter21/exercise4/";
        final String FILE_NAME = "file.txt";
        final String PATH = DIRECTORY_PATH + FILE_NAME;

        Path path = Paths.get(PATH);
        try(BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
