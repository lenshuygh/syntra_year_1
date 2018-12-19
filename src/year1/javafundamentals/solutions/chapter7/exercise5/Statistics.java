package year1.javafundamentals.solutions.chapter7.exercise5;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class Statistics {
    public static double average(int... values){
        if(values.length == 0) {
            return 0;
        }

        int total = 0;
        for (int value : values) {
            total += value;
        }

        return total / (double) values.length;
    }

    public static int min(int... values){
        int min = values[0];
        for (int value : values) {
            min = min < value ? min : value;
        }
        return min;
    }

    public static int max(int... values){
        int max = values[0];
        for (int value : values) {
            if(value > max){
                max = value;
            }
        }
        return max;
    }


}
