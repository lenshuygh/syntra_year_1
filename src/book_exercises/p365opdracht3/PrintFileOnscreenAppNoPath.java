package book_exercises.p365opdracht3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintFileOnscreenAppNoPath {
    public static void main(String[] args) {
        //Path path = Paths.get("C:\\data\\folder\\file666.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader("MyFile2.txt"))){
            String l =  null;
            while ((l = reader.readLine()) != null){
                System.out.println(l);
            }
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

    }
}
