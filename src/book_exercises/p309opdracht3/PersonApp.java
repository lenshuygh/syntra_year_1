package book_exercises.p309opdracht3;

import java.util.stream.Stream;

public class PersonApp {
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
        personStream.forEach(System.out::println);
        System.out.println("------------------------");
        Stream.of(p1,p2)
                .forEach(System.out::println);
    }
}
