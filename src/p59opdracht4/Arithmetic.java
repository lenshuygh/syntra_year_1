package p59opdracht4;

public class Arithmetic {
    public static void main(String[] args) {
        int number1;
        int number2;
        number1 = 2147483645;
        number2 = 2147483642;

        int sum = number1 + number2;
        System.out.println("sum = " + sum);
        System.out.println("sum long = " + (long) number1 + number2);


        int diff = number2 - number1;
        System.out.println("difference = " + diff);

        int prod = number1 * number2;
        System.out.println("product = " + prod);
        System.out.println("product = " + (long) number1 * number2);

        int div = number2 / number1;
        System.out.println("Division = " + div);

        int div2 = number1 / number2;
        System.out.println("Division other order : " + div2);

        long div3 = (long) number1 / number2;
        System.out.println("Division other order : " + div3);

        int modulus = number2 % number1;
        System.out.println("MOD = " + modulus);

        System.out.println("number1++ = " + number1++);
        System.out.println("++number1 = " + ++number1);

        System.out.println("number1-- = " + number1--);
        System.out.println("--number1 = " + --number1);

        char c = 'x';
        System.out.println("c = " + c);
        c += 1;
        System.out.println("c = " + c);
        c += 1;
        System.out.println("c = " + c);



    }
}
