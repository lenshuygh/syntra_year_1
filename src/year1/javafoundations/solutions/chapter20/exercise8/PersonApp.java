package year1.javafoundations.solutions.chapter20.exercise8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by JonathanSyntra on 26/03/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        List<Person> personCollection = new ArrayList<>();

        personCollection.add(
                new Person("Gunter","aEenAchternaam", Person.Gender.MALE, 27, 80, 170));
        personCollection.add(
                new Person("Gunterina","cEenAndereAchternaam", Person.Gender.FEMALE, 23, 55, 160));
        personCollection.add(
                new Person("Gunterina","gEenAndereAchternaam", Person.Gender.FEMALE, 23, 55, 160));
        personCollection.add(
                new Person("Gunterina","gEenAndereAchternaam", Person.Gender.FEMALE, 23, 56, 160));
        personCollection.add(
                new Person("Steven","bNogEenAchternaam", Person.Gender.MALE, 35, 90, 175));
        personCollection.add(
                new Person("Steven","eNogEenAchternaam", Person.Gender.MALE, 35, 90, 175));
        personCollection.add(
                new Person("Stevenina","fNogEenAndereAchternaam", Person.Gender.FEMALE, 53, 75, 180));

        personCollection.forEach(System.out::println);

        System.out.println("Sorted by natural order:");
        personCollection.sort(Comparator.naturalOrder());
        personCollection.forEach(System.out::println);

        System.out.println("Sorted by weight:");
        personCollection.sort(Comparator.comparingDouble(Person::getWeight));
        personCollection.forEach(System.out::println);
    }
}
