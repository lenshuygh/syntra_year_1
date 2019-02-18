package playground.codewars;

import java.util.ArrayList;
import java.util.List;

public class DirectionsReduction {
    public static void main(String[] args) {
        String[] strings = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        for (String s : dirReduc(strings)) {
            System.out.println(s);
        }
    }

    public static String[] dirReduc(String[] arr) {
        // Your code here.
        int n = 0;
        int e = 0;
        int s = 0;
        int w = 0;
        for (String s1 : arr) {
            switch (s1) {
                case "NORTH":
                    n++;
                    break;
                case "SOUTH":
                    s++;
                    break;
                case "EAST":
                    s++;
                    break;
                case "WEST":
                    w++;
                    break;
            }
        }
        List<String> list = new ArrayList<>();
        if(n>s){
            for (int i = 0; i < (n - s); i++) {
                list.add("NORTH");
            }
        }else{
            for (int i = 0; i < (s - n); i++) {
                list.add(("SOUTH"));
            }
        }
        if(e>w){
            for (int i = 0; i < (e-w); i++) {
                list.add("EAST");
            }
        }else{
            for (int i = 0; i < (w-e); i++) {
                list.add(("WEST"));
            }
        }
        String[] out = new String[list.size()];
        return out;
    }
}


/*
"\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\""
 */