package playground.lists;

import java.util.ArrayList;
import java.util.List;

public class ListsTest {
    public static void main(String[] args) {
        new ListsTest();
    }

    public ListsTest(){
        System.out.println("start");
        List<String> stringList = new ArrayList<>();
        char a = 'a';
        for (int i = 'a'; i <= 'z'; i++) {
            stringList.add(""+(char)i);
        }
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
