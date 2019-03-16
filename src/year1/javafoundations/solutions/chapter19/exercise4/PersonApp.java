package year1.javafoundations.solutions.chapter19.exercise4;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

/**
 * Created by JonathanSyntra on 11/03/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Laurens","EenAchternaam", Person.Gender.MALE, 27, 80, 170),
                new Person("Romy","EenAndereAchternaam", Person.Gender.FEMALE, 23, 55, 160),
                new Person("Michiel","NogEenAchternaam", Person.Gender.MALE, 35, 90, 175),
                new Person("Paula","NogEenAndereAchternaam", Person.Gender.FEMALE, 53, 75, 180)
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
                .mapToInt(Person::getAge)
                .forEach(System.out::println);

        System.out.println("Names:");
        Stream.of(persons)
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .forEach(System.out::println);

        System.out.println("Average age:");
        printOptional(Stream.of(persons).mapToInt(p -> p.getAge()).average());

        System.out.println("Minimum age:");
        printOptional(Stream.of(persons).mapToInt(p -> p.getAge()).min());

        System.out.println("Maximum age:");
        printOptional(Stream.of(persons).mapToInt(p -> p.getAge()).max());

        System.out.println("Weights:");
        Stream.of(persons)
                .mapToDouble(Person::getWeight)
                .forEach(System.out::println);

        System.out.println("Average weight:");
        printOptional(Stream.of(persons).mapToDouble(p -> p.getWeight()).average());

        System.out.println("Minimum weight:");
        printOptional(Stream.of(persons).mapToDouble(p -> p.getWeight()).min());

        System.out.println("Maximum weight:");
        printOptional(Stream.of(persons).mapToDouble(p -> p.getWeight()).max());
    }

    public static void printOptional(OptionalInt optionalInt){
        System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : "No Result");
    }

    public static void printOptional(OptionalDouble optionalDouble){
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : "No Result");
    }

    public static void printOptional(int number){
        System.out.println(number);
    }
    public static void printOptional(long number){
        System.out.println(number);
    }
}