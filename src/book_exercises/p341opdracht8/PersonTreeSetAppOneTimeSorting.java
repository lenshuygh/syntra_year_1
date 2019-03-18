package book_exercises.p341opdracht8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonTreeSetAppOneTimeSorting {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person p1 = new Person("Lens", "Huygh", Person.Gender.MALE, 38, 100, 1.75f);
        Person p2 = new Person("Smiege", "KatteMans", Person.Gender.MALE, 14, 3.5f, 14.5f);
        Person p3 = new Person("Thor", "ApexKatteMans", Person.Gender.MALE, 13, 4, 14.5f);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        System.out.println("Standard sorting trough impl. of comparable in person class -> LastName");

        for (Person person : personList) {
            System.out.println(person);
        }

        personList.sort(Comparator.naturalOrder());

        System.out.println("Sorted on FirstName");

        for (Person person : personList) {
            System.out.println(person);
        }



    }
}
