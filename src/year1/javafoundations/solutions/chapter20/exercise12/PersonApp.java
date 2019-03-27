package year1.javafoundations.solutions.chapter20.exercise12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by JonathanSyntra on 29/03/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        TreeMap<String,Person> stringPersonMap = new TreeMap<>();
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

        for (Person person : personCollection) {
            stringPersonMap.put(person.getLastName(),person);
        }

        stringPersonMap.keySet().forEach(System.out::println);

        System.out.println(stringPersonMap.get("bNogEenAchternaam"));
        System.out.println("firstKey: " + stringPersonMap.get(stringPersonMap.firstKey()));
        System.out.println(stringPersonMap.firstEntry().getValue());
        System.out.println(stringPersonMap.lastEntry().getValue());
    }
}
