package year1.javafoundations.solutions.chapter21.exercise3;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class FileReaderApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javafoundations/chapter21/exercise2/";
        final String FILE_NAME = "file.txt";

        try(FileReader fileReader = new FileReader(DIRECTORY_PATH + FILE_NAME)){
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
