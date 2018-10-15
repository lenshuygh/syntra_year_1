package examples.algorithms.self;

public class Numerals {
    public static void main(String[] args) {
        new Numerals();
    }

    public Numerals(){
        System.out.println("byte max value -> " + Byte.MAX_VALUE);
        System.out.println("byte min value -> " + Byte.MIN_VALUE);

        System.out.println("short max value -> " + Short.MAX_VALUE);
        System.out.println("short min value -> " + Short.MIN_VALUE);

        System.out.println("integer max value -> " + Integer.MAX_VALUE);
        System.out.println("integer min value -> " + Integer.MIN_VALUE);

        System.out.println("long max value -> " + Long.MAX_VALUE);
        System.out.println("long min value -> " + Long.MIN_VALUE);

        System.out.println("float max value -> " + Float.MAX_VALUE);
        System.out.println("float min value -> " + Float.MIN_VALUE);
    }
}
