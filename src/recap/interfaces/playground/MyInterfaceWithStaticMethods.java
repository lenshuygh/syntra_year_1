package recap.interfaces.playground;

public interface MyInterfaceWithStaticMethods {
    int CONST = 666;

    public void callStaticInterfaceMethod();

    public static void printConstant(){
        System.out.println(CONST);
    }
}
