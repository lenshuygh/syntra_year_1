package book_exercises.p375opdracht9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.format.DateTimeFormatter;

public class CivilService {


    public static void main(String[] args) {
        final String path = "file.person";
        final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path))) {
            Person person = (Person) objectInputStream.readObject();
            System.out.println(person.getFirstName());
            System.out.println(person.getLastName());
            System.out.println(dateTimeFormatter.format(person.getBirthDay()));
            System.in.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
