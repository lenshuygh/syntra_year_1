package year1.javafoundations.solutions.chapter20.exercise2;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by JonathanSyntra on 20/03/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        Collection<Person> personCollection = new HashSet<>();
        personCollection.add(
                new Person("Gunter","EenAchternaam", Person.Gender.MALE, 27, 80, 170));
        personCollection.add(
                new Person("Gunterina","EenAndereAchternaam", Person.Gender.FEMALE, 23, 55, 160));
        personCollection.add(
                new Person("Gunterina","EenAndereAchternaam", Person.Gender.FEMALE, 23, 55, 160));
        personCollection.add(
                new Person("Steven","NogEenAchternaam", Person.Gender.MALE, 35, 90, 175));
        personCollection.add(
                new Person("Steven","NogEenAchternaam", Person.Gender.MALE, 35, 90, 175));
        personCollection.add(
                new Person("Stevenina","NogEenAndereAchternaam", Person.Gender.FEMALE, 53, 75, 180));

        personCollection.forEach(System.out::println);
    }
}
