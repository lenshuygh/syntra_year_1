package recap.interfaces.playground;

public class DefiningAbstractOverridenDefaultMEthodsFromInterface extends ImplementInterfaceWithDeafaultMethodsAbstractDefaultMethods {
    int scale = 50;

    public static void main(String[] args) {
        new DefiningAbstractOverridenDefaultMEthodsFromInterface();
    }

    public DefiningAbstractOverridenDefaultMEthodsFromInterface(){
        System.out.println(getScale());
        scale(4);
        System.out.println(getScale());
        scaleDouble();
        System.out.println(getScale());
        scaleHalf();
        System.out.println(getScale());
    }

    @Override
    public void scaleDouble() {
        scale(500);
    }

    @Override
    public void scaleHalf() {
        scale(10);
    }
}
