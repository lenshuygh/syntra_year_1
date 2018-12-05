package p144opdracht5;

public class Statistics {
    public static void main(String[] args) {
        System.out.println("avg: " + average(new int[] {5,8,9,2,6,7,0,0,0,8,9,45,78,16,18,3}));
        System.out.println("min: " + min(new int[] {5,8,9,2,6,7,0,0,0,8,9,45,78,16,18,3}));
        System.out.println("max: " + max(new int[] {5,8,9,2,6,7,0,0,0,8,9,45,78,16,18,3}));
    }

    public static double average(int ... values){
        if(values.length == 0){
            return 0d;
        }
        double avg = 0d;
        for (int value : values) {
            avg += value;
        }
        return avg / values.length;
    }

    public static int min(int ... values){
        int min = values[0];
        for (int value : values) {
            min = (value < min) ? value : min;
        }
        return min;
    }

    public static int max(int ... values){
        int max = 0;
        for (int value : values) {
            max = (value > max) ? value : max;
        }
        return max;
    }
}
