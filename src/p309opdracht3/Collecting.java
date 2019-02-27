package p309opdracht3;

import java.util.stream.Stream;

public class Collecting {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setVoornaam("Lens");
        p1.setAchternaam("Huygh");
        p1.setGeslacht(Geslacht.MAN);
        p1.setLeeftijd(38);
        p1.setGewicht(100);

        Person p2 = new Person();
        p2.setVoornaam("Thor");
        p2.setAchternaam("Kattemans");
        p2.setGeslacht(Geslacht.VROUW);
        p2.setLeeftijd(14);
        p2.setGewicht(4);

        Stream<Person> personStream = Stream.of(p1,p2);
        Person[] persons = Stream.of(p1,p2).toArray(Person[]::new);

        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println("------------------------------------");
        Stream<Person> personStream1 = Stream.of(p1,p2);
        Person[] persArray = personStream1.toArray(size -> new Person[size]);

        for (Person person : persArray) {
            System.out.println(person);
        }
    }
}
