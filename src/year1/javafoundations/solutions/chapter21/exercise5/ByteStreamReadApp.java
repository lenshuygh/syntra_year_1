package year1.javafoundations.solutions.chapter21.exercise5;

import java.io.*;
import java.util.zip.InflaterInputStream;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class ByteStreamReadApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javafoundations/chapter21/exercise5/";
        final String FILE_NAME = "file.txt";
        final String PATH = DIRECTORY_PATH + FILE_NAME;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new InflaterInputStream(new FileInputStream(PATH))))){
            System.out.println(reader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
