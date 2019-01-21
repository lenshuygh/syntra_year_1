package playground.abstract_classes;

public class AbstractApp {
    public static void main(String[] args) {
        System.out.println("Parent parent = new Parent()");
        System.out.println("------");
        Parent parent = new Parent();
        System.out.println("getId -> "+ parent.getId());
        System.out.println("id -> "+ parent.id);
        parent.printClass();
        parent.printStaticClass();

        System.out.println("Child child = new Child()");
        System.out.println("-----");
        Child child0 = new Child();
        Child child = new Child();
        System.out.println("getId -> "+ child.getId());
        System.out.println("id -> "+ child.id);
        child.printClass();
        child.printStaticClass();

        System.out.println("Parent pc = new Child()");
        System.out.println("------");
        Parent pc = new Child();
        System.out.println("getId -> " + pc.getId());
        System.out.println("id -> " + pc.id);
        pc.printClass();
        pc.printStaticClass();

    }
}
