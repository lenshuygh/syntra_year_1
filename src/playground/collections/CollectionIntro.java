package playground.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIntro {
    public static void main(String[] args) {
        //int[] numbers = new int[10];
        //int[] numberss = {5,6,7,8,9};

        Collection<String> collection = new ArrayList<>();

        System.out.println("printig empty");
        System.out.println("-------------");
        printCollection(collection);
        System.out.println("-------------");

        collection.add("Hello");
        collection.add("Wrold");
        collection.add("Mars");
        collection.add("venus");
        collection.add("moon");
        collection.add("earth");
        collection.add("!!!!");

        System.out.println("printig collection");
        System.out.println("------------------");
        printCollection(collection);
        System.out.println("------------------");

        collection.remove("Hello");
        System.out.println("Removed element");
        System.out.println("---------------");
        printCollection(collection);
        System.out.println("---------------");
/*
        collection.add(null);
        System.out.println("printing after adding null");
        System.out.println("--------------------------");
        printCollection(collection);
        System.out.println("--------------------------");*/

        System.out.println("these 4 iterations are basicaly the same");
        System.out.println("-----------------------------------------");

        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String s : collection) {
            System.out.println(s);
        }

        collection.forEach(System.out::println);

        collection.stream().forEach(System.out::println);


        System.out.println("Stream friendly!!!");
        System.out.println("------------------");
        collection.stream()
                .filter(word -> word.contains("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

    private static void printCollection(Collection<String> collection) {
        for (String s : collection) {
            System.out.println(s.toUpperCase());
        }
    }
}
