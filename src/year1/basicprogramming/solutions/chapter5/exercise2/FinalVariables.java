package year1.basicprogramming.solutions.chapter5.exercise2;

/**
 * Created by JonathanSyntra on 2/10/2016.
 */
public class FinalVariables {
    public static void main(String[] args) {
        boolean aBoolean = false;
        char aCharacter = 'd';
        byte aByte = 126;
        short aShortInteger = 1568;
        int anInteger = 1256456;
        long aLongInteger = 45631341L;
        float aDecimalNumber = 1256.32F;
        double aBigDecimalNumber = 12.365987451236;
        final double PI = 3.14;
        //PI = 3.15;

        System.out.println(aBoolean);
        System.out.println(aCharacter);
        System.out.println(aByte);
        System.out.println(aShortInteger);
        System.out.println(anInteger);
        System.out.println(aLongInteger);
        System.out.println(aDecimalNumber);
        System.out.println(aBigDecimalNumber);

        System.out.println("Integer octal 0342");
        anInteger = 0342;
        System.out.println(anInteger);

        System.out.println("Integer hexa 0x5631");
        anInteger = 0x5631;
        System.out.println(anInteger);

        System.out.println("Integer bin 0b10011100");
        anInteger = 0b10011100;
        System.out.println(anInteger);
    }
}
