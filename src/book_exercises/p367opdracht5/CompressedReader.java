package book_exercises.p367opdracht5;

import java.io.*;
import java.util.zip.InflaterInputStream;

public class CompressedReader {


    public static void main(String[] args) {
        final String input = "C:\\data\\folder\\MyFile2.deflated";
        try(InputStreamReader isr = new InputStreamReader(new InflaterInputStream(new FileInputStream(input)))){
            int b = 0;
            while( (b = isr.read()) != -1){
                System.out.print((char) b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
