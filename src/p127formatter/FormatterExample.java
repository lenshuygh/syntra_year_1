package p127formatter;

import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        String text = "I'm %d years old";
        formatter.format(text,21);
        System.out.println(formatter);

        String s = " I'm %d years old and I am %f meters tall";
        formatter.format(s,21,1.73);
        System.out.println(formatter);
    }
}
