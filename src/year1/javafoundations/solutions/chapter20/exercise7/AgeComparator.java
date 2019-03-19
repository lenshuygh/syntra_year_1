package year1.javafoundations.solutions.chapter20.exercise7;

import java.util.Comparator;

/**
 * Created by JonathanSyntra on 26/03/2017.
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
