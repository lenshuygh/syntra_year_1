package book_exercises.p72;

public class Opdracht11 {
    public static void main(String[] args) {
        int number1, number2,number3;
        number1 = 57;
        number2 = 33;
        number3 = -65;

        int out;

        out = (number1 < number2) ? number1 : number2;
        System.out.println(number1 + " < " + number2 + " -> " + out);

        out = (number1 < number3) ? number1 : number3;
        System.out.println(number1 + " < " + number3 + " -> " + out);

        out = (number2 < number1) ? number2 : number1;
        System.out.println(number2 + " < " + number1 + " -> " + out);

        out = (number2 < number3) ? number2 : number3;
        System.out.println(number2 + " < " + number2 + " -> " + out);

        out = (number3 < number1) ? number3 : number1;
        System.out.println(number3 + " < " + number1 + " -> " + out);

        out = (number3 < number2) ? number3 : number2;
        System.out.println(number3 + " < " + number2 + " -> " + out);

    }
}
