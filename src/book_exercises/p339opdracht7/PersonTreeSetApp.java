package book_exercises.p339opdracht7;

import java.util.*;

public class PersonTreeSetApp {
    public static void main(String[] args) {
        Collection<Person> personSet = new TreeSet<>();

        Person p1 = new Person("Lens", "Huygh", Person.Gender.MALE, 38, 100, 1.75f);
        Person p2 = new Person("Thor", "KatteMans", Person.Gender.MALE, 13, 4, 14.5f);
        Person p3 = new Person("Thor", "KatteMans", Person.Gender.MALE, 13, 4, 14.5f);

        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);

        for (Person person : personSet) {
            System.out.println(person);
        }

        Collection<Person> personSetAgeSorted = new TreeSet<>(new AgeComparator());
        personSetAgeSorted.add(p1);
        personSetAgeSorted.add(p2);
        personSetAgeSorted.add(p3);
        System.out.printf("%npersonSetAgeSorted:%n------------------%n");
        personSetAgeSorted.forEach(System.out::println);

        /*SortedSet<Person> personSetWeightSorted = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (int) (o1.getWeight() - o2.getWeight());
            }
        });*/

        SortedSet<Person> personSetWeightSorted = new TreeSet<>((o1, o2) -> (int) (o1.getWeight() - o2.getWeight()));

        personSetWeightSorted.add(p1);
        personSetWeightSorted.add(p2);
        personSetWeightSorted.add(p3);

        System.out.printf("%npersonSetWeightSorted%n---------------------%n");
        personSetWeightSorted.forEach(System.out::println);

        SortedSet<Person> personSetFirstNameSorted = new TreeSet<>(Comparator.comparing(Person::getFirstName));
        personSetFirstNameSorted.add(p1);
        personSetFirstNameSorted.add(p2);
        personSetFirstNameSorted.add(p3);
        System.out.printf("%npersonSetFirstNameSorted:%n------------------------%n");
        personSetFirstNameSorted.forEach(System.out::println);


        SortedSet<Person>  personSetSortedByAgeNameWeight = new TreeSet<>(Comparator
                .comparingInt(Person::getAge)
                .thenComparing(Person::getLastName)
                .thenComparing((o1,o2) -> (int) (o1.getWeight() - o2.getWeight())));

        Person x1 = new Person("Be","Bee", Person.Gender.MALE,40,20f,1.50f);
        Person x2 = new Person("Cc","Ccc", Person.Gender.MALE,40,20f,1.50f);
        Person x3 = new Person("1","Aaa", Person.Gender.MALE,25,10f,1.50f);
        Person x4 = new Person("2","Aaa", Person.Gender.MALE,25,20f,1.50f);
        Person x5 = new Person("4","Ccc", Person.Gender.MALE,25,20f,1.50f);
        Person x6 = new Person("3","Bbb", Person.Gender.MALE,25,20f,1.50f);
        Person x7 = new Person("Bb","Bbb", Person.Gender.MALE,40,10f,1.100f);

        personSetSortedByAgeNameWeight.add(x1);
        personSetSortedByAgeNameWeight.add(x2);
        personSetSortedByAgeNameWeight.add(x3);
        personSetSortedByAgeNameWeight.add(x4);
        personSetSortedByAgeNameWeight.add(x5);
        personSetSortedByAgeNameWeight.add(x6);
        personSetSortedByAgeNameWeight.add(x7);
        System.out.printf("%npersonSetSortedByAgeNameWeight:%n------------------------------%n");
        personSetSortedByAgeNameWeight.forEach(System.out::println);
    }
}
