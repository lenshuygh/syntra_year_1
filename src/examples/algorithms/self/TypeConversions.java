package examples.algorithms.self;

public class TypeConversions {
    public static void main(String[] args) {
        short aShort = 123;
        int anInt = aShort;
        System.out.println(anInt);
        System.out.println("--------");
        anInt = 123456789;
        aShort = (short) anInt;
        System.out.println(aShort);
    }
}
