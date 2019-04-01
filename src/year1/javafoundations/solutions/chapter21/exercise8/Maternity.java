package year1.javafoundations.solutions.chapter21.exercise8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class Maternity {
    public static final String DIRECTORY_PATH = "javafoundations/chapter21/exercise8/";
    public static final String FILE_EXTENSION = ".ser";
    public static final String FIRSTNAME = "Donald";
    public static final String LASTNAME = "Trump";
    public static final String PATH = DIRECTORY_PATH + FIRSTNAME + LASTNAME + FILE_EXTENSION;

    public static void main(String[] args) {
        createFileIfNeeded(PATH);

        Person person = new Person(FIRSTNAME, LASTNAME, LocalDate.now());

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATH))) {
            objectOutputStream.writeObject(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
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
