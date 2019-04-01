package year1.javafoundations.solutions.chapter21.exercise6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by JonathanSyntra on 17/04/2017.
 */
public class CivilService {
    public static void main(String[] args) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(Maternity.PATH))){
            Person person = (Person) objectInputStream.readObject();
            System.out.println(Maternity.FIRSTNAME.equals(person.getFirstname()));
            System.out.println(Maternity.LASTNAME.equals(person.getLastname()));
            System.out.println(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
