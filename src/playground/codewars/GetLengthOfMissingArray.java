package playground.codewars;

import java.util.HashMap;
import java.util.Map;

public class GetLengthOfMissingArray {
    public static void main(String[] args) {
        Object[][] arr = { new Object[] { 1, 2 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }};
        Object[][] arr2 = { new Object[][] { new Object[] { 5, 2, 9 }, new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }}};
        Object[][] arr3 = {new Object[] {}, new Object[] {0, 1}, new Object[] {2, 3, 1}};
        Object[][] arr4 = {new Object[] {0, 3, 4, 4, 0, 4}, new Object[] {1, 2, 2, 0}, new Object[] {2, 0, 4, 4, 0, 2, 3}};
        System.out.println(getLengthOfMissingArray(arr4));
    }

    private static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (null == arrayOfArrays){
            return 0;
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (Object[] objects : arrayOfArrays) {
            if(objects.length == 0){
                return 0;
            }
            if(objects.length > max){
                max = objects.length;
            }
            if(objects.length < min){
                min = objects.length;
            }
        }
        for (int i = min; i < max; i++) {
            boolean found = false;
            for (Object[] objects : arrayOfArrays) {
                if(objects.length == i){
                    found = true;
                }
            }
            if (!found){
                return i;
            }
        }
        return 0;
    }
}
