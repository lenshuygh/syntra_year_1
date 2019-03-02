package recap.nestedClasses.static_nested_class;

public class StaticNestedClass {
    public static class InnerClass {
        public void identify(){
            System.out.println("printed with method from static nested class inside " + this);
        }
    }
}
