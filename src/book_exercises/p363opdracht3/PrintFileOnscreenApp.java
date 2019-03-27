package book_exercises.p363opdracht3;

import java.io.FileReader;
import java.io.IOException;

public class PrintFileOnscreenApp {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("C:\\data\\folder\\file666.txt")){
            int character;
            while ((character = fileReader.read()) != -1){
                System.out.print((char)character);
            }
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

    }
}
