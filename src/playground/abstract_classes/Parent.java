package playground.abstract_classes;

public class Parent {
    public static int id = 0;
    public static final String CLASS_NAME = "Parent";

    {
        id++;
    }

    public int getId() {
        return id;
    }

    public void printClass(){
        System.out.println("This is the "+CLASS_NAME+"-class");
    }

    public static void printStaticClass(){
        System.out.println("This is the "+CLASS_NAME+"-class but STATIC");
    }
}
