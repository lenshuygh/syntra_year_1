package p312opdracht4;

import p309opdracht3.Geslacht;


import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
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
                //.mapToInt(Person::getLeeftijd)
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

        System.out.println();
        System.out.println("all weights");
        Stream.of(persons).map(Person::getGewicht).forEach(System.out::println);

        System.out.println();
        System.out.println("avg weight");
        System.out.println(Stream.of(persons).mapToDouble(Person::getGewicht).average().getAsDouble());

        System.out.println();
        System.out.println("min weight");
        System.out.println(Stream.of(persons).mapToDouble(Person::getGewicht).min().getAsDouble());

        System.out.println();
        System.out.println("max weight");
        System.out.println(Stream.of(persons).mapToDouble(Person::getGewicht).max().getAsDouble());

        System.out.println();
        System.out.println("sum roots of 0-100 with % 5 & 8 ok");
        System.out.println(
                IntStream.rangeClosed(0,1000)
                        .filter(s -> s % 40 == 0)
                        .limit(20)
                        .mapToDouble(Double::new)
                        .reduce(0,(acc,el) -> acc + Math.sqrt(el)));
        System.out.println();
        System.out.println(
                IntStream.rangeClosed(0,1000)
                        .filter(s -> s % 40 == 0)
                        .limit(20)
                        .mapToDouble(Math::sqrt)
                        .sum());
        System.out.println();
        System.out.println(
                IntStream.rangeClosed(0,1000)
                        .filter(s -> s % 40 == 0)
                        .limit(20)
                        .reduce(0,(acc,el) -> acc + (int) Math.sqrt(el)));

        System.out.println();
        int[] array = new Random()
                .ints(0,10000)
                .distinct()
                .filter(s -> s % 2 == 0)
                .limit(500)
                .sorted()
                .toArray();

        System.out.println(array.length);

        int[] a = IntStream.range(0, 10000)
                .mapToObj(Random::new)
                .mapToInt(Random::nextInt)
                .distinct()
                .filter(s -> s % 2 == 0)
                .limit(500)
                .toArray();

        System.out.println(a.length );
    }
}
