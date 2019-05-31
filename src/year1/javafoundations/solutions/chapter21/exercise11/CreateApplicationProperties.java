package year1.javafoundations.solutions.chapter21.exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by JonathanSyntra on 19/04/2017.
 */
public class CreateApplicationProperties {
    public static final String DIRECTORY_PATH = "javafoundations/chapter21/exercise11/";
    public static final String FILE_NAME = "application.properties";
    public static final String PATH = DIRECTORY_PATH + FILE_NAME;

    public static void main(String[] args) {
        ApplicationProperties applicationProperties = new ApplicationProperties(PATH);
        applicationProperties.setX(20);
        applicationProperties.setY(30);
        applicationProperties.setHeight(550);
        try {
            createFileIfNeeded(PATH);
            applicationProperties.store();
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
