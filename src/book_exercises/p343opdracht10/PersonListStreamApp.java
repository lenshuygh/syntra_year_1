package book_exercises.p343opdracht10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonListStreamApp {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Person p1 = new Person("Lens", Person.Gender.MALE, 38);
        Person p2 = new Person("Lotte", Person.Gender.FEMALE, 34);
        Person p3 = new Person("De Mama", Person.Gender.FEMALE, 60);
        Person p4 = new Person("Gert", Person.Gender.MALE, 37);
        Person p5 = new Person("Dasha", Person.Gender.FEMALE, 38);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        List<Person> femalePersonList = personList.stream()
                .filter(f -> f.getGender() == Person.Gender.FEMALE)
                .filter(a -> a.getAge() > 35)
                .sorted(Comparator.comparingInt(Person::getAge))
                //.collect(Collectors.toCollection(LinkedList::new))
                .collect(Collectors.toList());

        //List<Person> myLinkedList = new LinkedList<>(femalePersonList);

        femalePersonList.forEach(System.out::println);
    }
}
