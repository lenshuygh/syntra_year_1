package year1.javafoundations.solutions.chapter21.exercise7.graphics;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class DrawingApp {

    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javafoundations/chapter21/exercise7/";
        final String FILE_EXTENSION = ".ser";
        final String FILENAME = "drawing";
        final String PATH = DIRECTORY_PATH + FILENAME + FILE_EXTENSION;

        createFileIfNeeded(PATH);

        Drawing drawing = new Drawing();

        for(int i = 0; i < 100; i++){
            try {
                drawing.addDrawable(new Circle(i));
            } catch (NegativeSizeException e) {
                e.printStackTrace();
            }
        }

        try {
            writeDrawingToFile(drawing, PATH);

            Drawing drawingFromFile = readDrawingFromFile(PATH);
            System.out.println(drawingFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void writeDrawingToFile(Drawing drawing, String path) throws IOException {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            objectOutputStream.writeObject(drawing);
        }
    }

    private static Drawing readDrawingFromFile(String path) throws IOException, ClassNotFoundException {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {
            Drawing drawing = (Drawing) objectInputStream.readObject();
            return drawing;
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
