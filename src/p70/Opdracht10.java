package p70;

public class Opdracht10 {
    public static void main(String[] args) {
        int number1 = 57;
        int number2 = 33;
        System.out.println(number1 + " += " + number2 + " = " + (number1 += number2));
        System.out.println(number1 + " -= " + number2 + " = " + (number1 -= number2));
        System.out.println(number1 + " *= " + number2 + " = " + (number1 *= number2));
        System.out.println(number1 + " /= " + number2 + " = " + (number1 /= number2));
        System.out.println(number1 + " %= " + number2 + " = " + (number1 %= number2));
        System.out.println(number1 + " &= " + number2 + " = " + (number1 &= number2));
        System.out.println(number1 + " |= " + number2 + " = " + (number1 |= number2));

        System.out.println("-------------------------------------------------");

        number1 = 57;
        number2 = 33;
        number1 += number2;
        System.out.println(" += -> " + number1);
        number1 -= number2;
        System.out.println(" -= -> " + number1);
        number1 *= number2;
        System.out.println(" *= -> " + number1);
        number1 /= number2;
        System.out.println(" /= -> " + number1);
        number1 %= number2;
        System.out.println(" %= -> " + number1);
        number1 &= number2;
        System.out.println(" &= -> " + number1);
        number1 |= number2;
        System.out.println(" |= -> " + number1);
    }
}
