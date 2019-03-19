package year1.javafoundations.solutions.chapter20.exercise10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by JonathanSyntra on 29/03/2017.
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

        List<Person> personList = personCollection.stream()
                .filter(p -> Person.Gender.FEMALE.equals(p.getGender()))
                .filter(p -> p.getAge() > 20)
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        personList.forEach(System.out::println);
    }
}
