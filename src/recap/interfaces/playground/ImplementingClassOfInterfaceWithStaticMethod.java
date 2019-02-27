package recap.interfaces.playground;

public class ImplementingClassOfInterfaceWithStaticMethod implements MyInterfaceWithStaticMethods {
    public static void main(String[] args) {
        new ImplementingClassOfInterfaceWithStaticMethod();
    }

    public ImplementingClassOfInterfaceWithStaticMethod(){
        callStaticInterfaceMethod();
    }

    @Override
    public void callStaticInterfaceMethod(){
        MyInterfaceWithStaticMethods.printConstant();
    }
}
