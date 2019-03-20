package playground.mapsasdb;

import java.util.*;

public class MapDatabase {
    public static void main(String[] args) {
        Map<String,Person> miniDataBase = new HashMap<>();
        //problem would be to make the key unique => UUID in Object(Person) class !!

        Person person = new Person("Jef","Klak");
        System.out.println(person.id);
        miniDataBase.put(person.id,person);

        //to test uniqueness of randomUUID-method

        /*int size = 1000000;
        Collection<String> uuids = new HashSet<>();
        for (int i = 0; i < size; i++) {
            uuids.add(UUID.randomUUID().toString());
        }

        System.out.println(size == uuids.size());*/
    }
}
