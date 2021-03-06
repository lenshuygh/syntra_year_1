package book_exercises.p374opdracht8;

import java.io.*;
import java.time.LocalDate;

public class Maternity {
    public static void main(String[] args) {
        final String path = "file.person";
        Person person = new Person("Lens","Huygh",LocalDate.of(1980,6,23));
        try(
                ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(path));
        ){
            objectOutput.writeObject(person);
            System.in.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
