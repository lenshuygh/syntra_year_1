package recap.nestedClasses;

public class OuterClassWithLocalInnerClassApp {
    public static void main(String[] args) {
        OuterClassWithLocalInnerClass outerClassWithLocalInnerClass = new OuterClassWithLocalInnerClass();
        outerClassWithLocalInnerClass.getInner().toString();
    }
}
