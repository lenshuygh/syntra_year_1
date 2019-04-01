package year1.javafoundations.solutions.chapter21.exercise5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.DeflaterOutputStream;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class OptionalByteStreamWriteApp {
    public static void main(String[] args) {
        try(    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream (byteArrayOutputStream)){

            printStream.write("Hello printstream diary".getBytes());
            System.out.println(byteArrayOutputStream.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
