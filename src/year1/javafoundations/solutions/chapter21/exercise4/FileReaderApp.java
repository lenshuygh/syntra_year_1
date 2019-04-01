package year1.javafoundations.solutions.chapter21.exercise4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class FileReaderApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javafoundations/chapter21/exercise4/";
        final String FILE_NAME = "file.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(DIRECTORY_PATH + FILE_NAME))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
