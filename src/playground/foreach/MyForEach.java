package playground.foreach;

import java.util.Iterator;

public class MyForEach {
    public static void main(String[] args) {
        String[] strings = new String[5];

        for (String myString : strings) {
            myString = "test";
        }

        for (String myString : strings) {
            System.out.println(myString);
        }

    }

}
