package p59opdracht5;

public class Arithmetic {
    public static void main(String[] args) {
       byte b1,b2,b3;

       b1 = 50;

       b2 = 20;

       //b3 = b1 * b2;

        // gets elevated to int so needs to be put into an int

        int i = b1 * b2;

        System.out.println("result in int = " + i);



        int i1,i2;

        i1 = 2147483645;

        i2 = 2147483642;

        int r = i1 * i2;

        System.out.println("WRONG result because values gets to high for the int datatype = " + r);

        long l = (long) i1 * i2;

        System.out.println("RIGHT result, cast on of the 2 values to long before multiplying = " + l);

    }
}
