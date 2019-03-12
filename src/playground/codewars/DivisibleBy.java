package playground.codewars;

import java.util.Arrays;

public class DivisibleBy {
    public static void main(String[] args) {
        int[] arr = {2,6,45,58,41};
        for (int i : divisibleBy(arr, 5)) {
            System.out.println(i);
        }
    }
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(s -> s % divider == 0).toArray();
    }
}
