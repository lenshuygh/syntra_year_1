package book_exercises.p326opdracht2;

import java.util.Collection;
import java.util.HashSet;

import static year1.javafoundations.solutions.chapter19.exercise1.Person.Gender.MALE;

public class PersonApp {
    public static void main(String[] args) {
        Collection<Person> personSet = new HashSet<>();

        Person p1 = new Person("Lens","Huygh", MALE,38,100,1.75);
        Person p2 = new Person("Thor","KatteMans", MALE,13,4,14.5);
        Person p3 = new Person("Thor","KatteMans", MALE,13,4,14.5);

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);

        for (Person person : personSet) {
            System.out.println(person);
        }


    }
}
