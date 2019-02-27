package recap.interfaces.playground;

public class ImplementInterfaceWithDeafaultMethods implements InterfaceWithDefaultMethods {
    private double scale = 100;

    public static void main(String[] args) {
        new ImplementInterfaceWithDeafaultMethods();
    }

    public ImplementInterfaceWithDeafaultMethods(){
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
}
