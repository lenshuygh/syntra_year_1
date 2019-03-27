package year1.javafoundations.solutions.chapter21.exercise1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JonathanSyntra on 13/04/2017.
 */
public class FilesApp {
    public static void main(String[] args) {
        final String DIRECTORY_PATH = "javafoundations/chapter21/exercise1/";
        final String FILE1_NAME = "file.txt";
        final String FILE2_NAME = "file_copy.txt";
        final String FILE1_RENAME = "renamedFile.txt";
        final String PATH1 = DIRECTORY_PATH + FILE1_NAME;
        final String PATH2 = DIRECTORY_PATH + FILE2_NAME;
        final String PATH1_RENAME = DIRECTORY_PATH + FILE1_RENAME;

        try {
            //Define path
            Path path = Paths.get(PATH1);
            //Create directory
            Files.createDirectories(path.getParent());
            //Create file if it not exists
            if(Files.notExists(path)){
                Files.createFile(path);
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
            //Write lines of text to file
            List<String> lines = new ArrayList<>();
            lines.add("Hello");
            lines.add("world");
            Files.write(path, lines, Charset.defaultCharset(), StandardOpenOption.APPEND);

            //Retrieve attributes of file
            DosFileAttributes attributes = Files.readAttributes(path, DosFileAttributes.class);

            System.out.println("Size: " + attributes.size());
            System.out.println("Creation time: " + attributes.creationTime());
            System.out.println("Last access time: " + attributes.lastAccessTime());
            System.out.println("Last modified time: " + attributes.lastModifiedTime());
            System.out.println("Archive: " + attributes.isArchive());
            System.out.println("Hidden: " + attributes.isHidden());
            System.out.println("Read only: " + attributes.isReadOnly());

            //Retrieve owner name
            FileOwnerAttributeView view = Files.getFileAttributeView(path, FileOwnerAttributeView.class);
            System.out.println("Owner name: " + view.getOwner().getName());
            System.out.println("Owner name2: " + Files.getOwner(path));

            //Read lines
            Files.lines(path).forEach(System.out::println);

            //Copy file
            Path path2 = Paths.get(PATH2);
            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);

            //Rename file
            Path pathRename = Paths.get(PATH1_RENAME);
            if(Files.exists(pathRename)){
                Files.delete(pathRename);
            }
            Files.move(path, pathRename);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
