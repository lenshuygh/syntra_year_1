package book_exercises.p354opdracht1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CreateFileInNewFolder {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("c:\\data\\folder\\file.txt");
            Files.createDirectories(path.getParent());
            if (Files.notExists(path)) {
                Files.createFile(path);

                System.out.println("Created file !");
            }
            List<String> lines = new ArrayList<>();
            lines.add("Thor & Smiegel sitting in a tree....");
            lines.add("Thor & Smiegel sitting in a tree....");

            Files.write(path,lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);


            DosFileAttributes dosFileAttributes = Files.readAttributes(path,DosFileAttributes.class);
            System.out.println("Properties of new file:");
            System.out.println("-----------------------");
            System.out.println("size: " + dosFileAttributes.size());
            System.out.println("creationTime: " + dosFileAttributes.creationTime());
            System.out.println("lastAccessed: " + dosFileAttributes.lastAccessTime());
            System.out.println("lastModded: " + dosFileAttributes.lastModifiedTime());
            System.out.println("archive?: " + dosFileAttributes.isArchive());
            System.out.println("hidden?: " + dosFileAttributes.isHidden());
            System.out.println("readOnly?: " + dosFileAttributes.isReadOnly());
            System.out.println();
            System.out.println();
            System.out.println("reading file:");
            System.out.println("-------------");
            Files.lines(path).forEach(System.out::println);
            System.out.println();
            System.out.println();
            System.out.println("owner of file:");
            System.out.println("--------------");
            System.out.println(Files.getOwner(path));
            System.out.println();
            System.out.println();
            System.out.println("copy file:");
            System.out.println("----------");
            Path path2 = Paths.get("c:\\data\\folder\\file666.txt");
            Files.copy(path,path2, StandardCopyOption.REPLACE_EXISTING);
            System.out.println();
            System.out.println();
            System.out.println("rename file...");
            Files.move(path,Paths.get("c:\\data\\"+ UUID.randomUUID().toString() +".txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
