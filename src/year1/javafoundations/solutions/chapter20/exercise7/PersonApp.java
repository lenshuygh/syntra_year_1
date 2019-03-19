package year1.javafoundations.solutions.chapter20.exercise7;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by JonathanSyntra on 20/03/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        //SortedSet<Person> personCollection = new TreeSet<>();
        //SortedSet<Person> personCollection = new TreeSet<>(new AgeComparator());
        /*SortedSet<Person> personCollection = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getWeight() < p2.getWeight()) return -1;
                if (p1.getWeight() > p2.getWeight()) return 1;
                return 0;
            }
        });*/
        /*SortedSet<Person> personCollection = new TreeSet<>((p1, p2) -> {
            if (p1.getWeight() < p2.getWeight()) return -1;
            if (p1.getWeight() > p2.getWeight()) return 1;
            return 0;
        });*/
        //SortedSet<Person> personCollection = new TreeSet<>(Comparator.comparingDouble(Person::getWeight));
        SortedSet<Person> personCollection = new TreeSet<>(Comparator
                .comparingInt(Person::getAge)
                .thenComparing(Person::getLastName)
                .thenComparingDouble(Person::getWeight));

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
    }
}
