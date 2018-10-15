package p52;

public class ex01 {
    public static void main(String[] args) {
        short aShort = 5;
        int anInt;
        anInt = aShort;
        System.out.println(anInt);

        short bShort;
        int bInt = 600_000;
        bShort = (short) bInt;

        System.out.println(bShort);

        short cShort;
        int cInt;
        char cChar = 'a';

        //cShort = cChar;
        cInt = cChar;

        //byte dByte = bShort;
        byte aByte = (byte) bShort;

        System.out.println("aByte = " + aByte);

        bShort = 115;
        aByte = (byte) bShort;

        System.out.println("aByte = " + aByte);

        //bShort = cChar;
        // bShort isn't necesary big enough for all values of char -> casting !!!

        bShort = (short) cChar;
        System.out.println("bShort -> " + bShort);

        cInt = cChar;
        System.out.println("cInt -> " + cInt);

        //cInt is big enough so no casting is needed
    }
}
