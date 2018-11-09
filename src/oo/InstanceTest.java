package oo;

public class InstanceTest {
    public static void main(String[] args) {
        Cat c = new ColoredCat("Black");
        System.out.println(c instanceof Cat);
        System.out.println(c instanceof  ColoredCat);
    }
}
