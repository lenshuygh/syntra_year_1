package recap.interfaces.playground;

public class ImplementInterfaceWithDeafaultMethodsOverrideDefaultMethods implements InterfaceWithDefaultMethods {
    private double scale = 100;

    public static void main(String[] args) {
        new ImplementInterfaceWithDeafaultMethodsOverrideDefaultMethods();
    }

    public ImplementInterfaceWithDeafaultMethodsOverrideDefaultMethods(){
        System.out.println("scale : " + scale);
        scale(30);
        System.out.println("scale : " + scale);
        scaleDouble();
        System.out.println("scale : " + scale);
        scaleHalf();
        System.out.println("scale : " + scale);

    }

    @Override
    public void scale(double factor) {
        scale *= factor/100;
    }

    @Override
    public void scaleDouble() {
        scale(400);
    }

    @Override
    public void scaleHalf() {
        scale(25);
    }
}
