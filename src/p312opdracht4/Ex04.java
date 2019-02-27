package p312opdracht4;

import p309opdracht3.Geslacht;


import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        Person p1 = new Person("Lens", "Huygh", Geslacht.MAN, 38, 100, 175);
        Person p2 = new Person("Thor", "Katmans", Geslacht.VROUW, 14, 5, 50);
        Person[] persons = {p1, p2};

        System.out.println("only female");
        Stream.of(persons).
                filter(p -> Geslacht.VROUW.equals(p.getGeslacht())).
                forEach(System.out::println);

        System.out.println();
        System.out.println("gewicht between 3 and 50");
        Stream.of(persons)
                .filter(p -> p.getGewicht() < 50)
                .filter((p -> p.getGewicht() > 3))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("leeftijd +30 and gewicht +50");
        Stream.of(persons)
                .filter(p -> p.getLeeftijd() > 30)
                .filter(p -> p.getGewicht() > 50)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("only ages");
        Stream.of(persons)
                .map(Person::getLeeftijd)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("voornaam and achternaam");
        Stream.of(persons)
                .map(s -> s.getVoornaam() + " " + s.getAchternaam())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Average age");
        OptionalDouble avg = Stream.of(persons).mapToInt(Person::getLeeftijd).average();
        System.out.println(avg.getAsDouble());

        System.out.println();
        System.out.println("minimum age");
        OptionalInt min = Stream.of(persons).mapToInt(Person::getLeeftijd).min();
        System.out.println(min.getAsInt());

        System.out.println();
        System.out.println("maximum age");
        OptionalInt max = Stream.of(persons).mapToInt(Person::getLeeftijd).max();
        System.out.println(max.getAsInt());
    }
}
