package recap.sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedPetsTroughPetObjectApp {
    public static void main(String[] args) {
        //pet is default sorted by name; uniqueness is checked by name and gender

        Pet p1 = new Pet("Thor",14,3.5f, Pet.Gender.MALE);
        Pet p2 = new Pet("Snickers",6,4, Pet.Gender.FEMALE);
        Pet p3 = new Pet("Elsa",10,5, Pet.Gender.FEMALE);
        Pet p4 = new Pet("Lyra",3,2, Pet.Gender.FEMALE);
        Pet p5 = new Pet("Mina",3,2, Pet.Gender.FEMALE);
        Pet p6 = new Pet("Smiegel",12,4, Pet.Gender.MALE);
        Pet p7 = new Pet("Smiegel",13,5, Pet.Gender.FEMALE);

        System.out.println("equals: " + p6.equals(p7));

        System.out.println("p6 hash = " + p6.hashCode());
        System.out.println("p7 hash = " + p7.hashCode());

        SortedSet<Pet> petSortedSet = new TreeSet<>();

        petSortedSet.add(p1);
        petSortedSet.add(p2);
        petSortedSet.add(p3);
        petSortedSet.add(p4);
        petSortedSet.add(p5);
        petSortedSet.add(p6);
        petSortedSet.add(p7);

        System.out.printf("%npetSortedSet:%n------------%n");
        petSortedSet.forEach(System.out::println);
    }
}
