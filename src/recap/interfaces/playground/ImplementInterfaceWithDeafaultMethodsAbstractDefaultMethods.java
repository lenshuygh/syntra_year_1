package recap.interfaces.playground;

public abstract class ImplementInterfaceWithDeafaultMethodsAbstractDefaultMethods implements InterfaceWithDefaultMethods{
    private int scale = 50;

    @Override
    public void scale(double factor) {
        scale*= factor/100;
    }

    @Override
    public abstract void scaleDouble();

    @Override
    public abstract void scaleHalf();

    public double getScale(){
        return this.scale;
    }
}
