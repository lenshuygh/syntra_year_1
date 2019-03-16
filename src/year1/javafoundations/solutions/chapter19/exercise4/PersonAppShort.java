package year1.javafoundations.solutions.chapter19.exercise4;

import java.util.stream.Stream;

/**
 * Created by JonathanSyntra on 13/03/2017.
 */
public class PersonAppShort {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Laurens", "EenAchternaam", Person.Gender.MALE, 27, 80, 170),
                new Person("Romy", "EenAndereAchternaam", Person.Gender.FEMALE, 23, 55, 160),
                new Person("Michiel", "NogEenAchternaam", Person.Gender.MALE, 35, 90, 175),
                new Person("Paula", "NogEenAndereAchternaam", Person.Gender.FEMALE, 53, 75, 180)
        };
        System.out.println("Females:");
        Stream.of(persons)
                .filter(p -> Person.Gender.FEMALE.equals(p.getGender()))
                .forEach(System.out::println);

        System.out.println("Older than 30:");
        Stream.of(persons)
                .filter(p -> p.getAge() > 30)
                .forEach(System.out::println);

        System.out.println("Weight between 50 and 85:");
        Stream.of(persons)
                .filter(p -> p.getWeight() > 50)
                .filter(p -> p.getWeight() < 85)
                .forEach(System.out::println);

        System.out.println("Older than 30 heavier than 80:");
        Stream.of(persons)
                .filter(p -> p.getAge() > 30)
                .filter(p -> p.getWeight() > 80)
                .forEach(System.out::println);

        System.out.println("Ages:");
        Stream.of(persons)
                .mapToInt(p -> p.getAge())
                .forEach(System.out::println);

        System.out.println("Names:");
        Stream.of(persons)
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .forEach(System.out::println);
    }
}
