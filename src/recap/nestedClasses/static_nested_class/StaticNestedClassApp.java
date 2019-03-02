package recap.nestedClasses.static_nested_class;

public class StaticNestedClassApp {
    public static void main(String[] args) {
        new StaticNestedClassApp();
    }

    StaticNestedClassApp(){
        StaticNestedClass.InnerClass innerClass = new StaticNestedClass.InnerClass();
        StaticNestedClass.InnerClass innerC = new StaticNestedClass.InnerClass();
        innerClass.identify();
        innerC.identify();
    }
}
