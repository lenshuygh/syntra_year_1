package oo;

public class InstanceTest {
    public static void main(String[] args) {
        ColoredCat cc = new ColoredCat(13,"black");
        System.out.println(Cat.class.isInstance(cc));
        System.out.println(ColoredCat.class.isInstance(Cat.class));
    }
}
