package playground.comparing;

import java.util.*;

public class BoxApp {
    public static void main(String[] args) {
        //Naturaly sorted
        //NavigableSet<Box> boxes = new TreeSet<>();

        // sorted with Comparator class
        //NavigableSet<Box> boxes = new TreeSet<>(new BoxComparator());

        List<Box> boxes = new ArrayList<>();

        boxes.add(new Box(5,10,30));
        boxes.add(new Box(2,12,5));
        boxes.add(new Box(8,15,12));

        // to sort the ArrayList NOW and not after a next add
        boxes.sort(new BoxComparator());
        // because comparator is functional interface we can use a lambda function
        //boxes.sort((box1,box2) -> box1.getHeight() - box2.getHeight());

        //better
        boxes.sort(Comparator.comparingInt(Box::getHeight));

        boxes.forEach(System.out::println);


    }
}
