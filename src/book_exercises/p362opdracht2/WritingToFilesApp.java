package book_exercises.p362opdracht2;

import java.io.*;

public class WritingToFilesApp {
    public static void main(String[] args) {
        System.out.println("writing the file");
        System.out.println("----------------");
        try(FileWriter fileWriter = new FileWriter("MyFile.txt")){
            fileWriter.write("Thor");
            fileWriter.write("&");
            fileWriter.write("Smiegel");
        }catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("somethin went awry !!!!!!");
        }

    }
}
