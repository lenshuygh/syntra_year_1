package year1.javafoundations.solutions.chapter19.exercise3;

import java.util.stream.Stream;

/**
 * Created by JonathanSyntra on 11/03/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        Person[] persons = {new Person("Laurens", Person.Gender.MALE), new Person("Romy", Person.Gender.FEMALE)};
        Person[] personsFromStream = Stream.of(persons).toArray(Person[]::new);
        for (Person person : personsFromStream) {
            System.out.println(person);
        }
    }
}
