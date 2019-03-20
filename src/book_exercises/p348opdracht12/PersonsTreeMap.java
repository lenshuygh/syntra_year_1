package book_exercises.p348opdracht12;

import java.util.TreeMap;

public class PersonsTreeMap {
    public static void main(String[] args) {
        Person p1 = new Person("Lens", Person.Gender.MALE,38);
        Person p2 = new Person("Gert", Person.Gender.MALE,36);
        Person p3 = new Person("Lotte", Person.Gender.FEMALE,34);
        Person p4 = new Person("Thor", Person.Gender.MALE,14);

        TreeMap<String,Person> personTreeMap = new TreeMap<>();

        personTreeMap.put(p1.getFirstName(),p1);
        personTreeMap.put(p2.getFirstName(),p2);
        personTreeMap.put(p3.getFirstName(),p3);
        personTreeMap.put(p4.getFirstName(),p4);


        System.out.println("printall");
        personTreeMap.forEach((k,v) -> System.out.println("Key: " + k + " => Value:" + v));



        System.out.println();
        System.out.println("Find Key Thor:");
        System.out.println(personTreeMap.get("Thor"));

        System.out.println();
        System.out.println("First person:");
        System.out.println(personTreeMap.firstEntry());

        System.out.println();
        System.out.println("Last person:");
        System.out.println(personTreeMap.lastEntry());
    }
}
