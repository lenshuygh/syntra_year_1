package year1.javafoundations.solutions.chapter20.exercise6;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by JonathanSyntra on 26/03/2017.
 */
public class PersonApp {
    public static void main(String[] args) {
        Deque<Person> personDeque = new ArrayDeque<>();
        Person person = new Person("Gunter", "EenAchternaam", Person.Gender.MALE, 27, 80, 170);
        Person person1 = new Person("Gunterina", "EenAndereAchternaam", Person.Gender.FEMALE, 23, 55, 160);
        Person person2 = new Person("Steven", "NogEenAchternaam", Person.Gender.MALE, 35, 90, 175);
        Person person3 = new Person("Stevenina", "NogEenAndereAchternaam", Person.Gender.FEMALE, 53, 75, 180);

        personDeque.offerFirst(person);
        personDeque.offerLast(person1);
        personDeque.offerFirst(person2);
        personDeque.offerLast(person3);

        Person pollFirst = personDeque.pollFirst();
        Person pollLast = personDeque.pollLast();
        while(pollFirst != null && pollLast != null){
            System.out.println(pollFirst + " + " + pollLast);
            pollFirst = personDeque.pollFirst();
            pollLast = personDeque.pollLast();
        }
    }
}
