package recap.interfaces.playground;

public class ImplementStandardInterface implements StandardInterface {

    public static void main(String[] args) {
        new ImplementStandardInterface();
    }

    public ImplementStandardInterface(){
        printNumber(10);
    }

    @Override
    public void printNumber(int number) {
        System.out.println("arument number = " + number);
        System.out.println("the number from the interface is : " + NUMBER);
    }
}
