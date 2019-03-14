package recap.CountingConstructors;

public class CountingConstructorsApp {
    public static void main(String[] args) {

        System.out.println(Shape.getCount());

        ExtendingClass extendingClass = new ExtendingClass();

        System.out.println(Shape.getCount());

        ExtendingTheExtendingClass extendingTheExtendingClass = new ExtendingTheExtendingClass();

        System.out.println(Shape.getCount());
    }
}
