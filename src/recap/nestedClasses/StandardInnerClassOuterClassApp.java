package recap.nestedClasses;

public class StandardInnerClassOuterClassApp {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println("main app");
        System.out.println("outer:");
        System.out.println(outerClass.classId);
        System.out.println(outerClass.getClassIdPrivate());

        OuterClass.InnerClass  outerClassInnerClass = outerClass.new InnerClass();
        System.out.println("inner:");
        System.out.println(outerClassInnerClass.classId);
        System.out.println(outerClassInnerClass.getClassIdPrivate());
    }
}
