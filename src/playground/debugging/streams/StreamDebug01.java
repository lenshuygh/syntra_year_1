package playground.debugging.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDebug01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Thor");
        myList.add("Smiegel");
        myList.add("Kiska");
        myList.add("Snickers");
        myList.add("Lyra");
        myList.add("Mina");
        myList.add("Elsa");

        List<String>list = myList.stream()
                .map(name -> name + name)
                .filter(name -> name.startsWith("S"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("List =" + list);
    }
}
