package recap.interfaces.p233opdracht2;

/**
 * Created by JonathanSyntra on 26/12/2016.
 */
public class IsoScelesTriangle extends Triangle {
    private static int count = 0;

    {
        count++;
    }

    public IsoScelesTriangle() {
        this(0,0);
    }

    public IsoScelesTriangle(int height, int width) {
        this(height, width,0,0);
    }

    public IsoScelesTriangle(int height, int width, int x, int y) {
        this.setHeight(height);
        this.setWidth(width);
        this.setPosition(x,y);
    }

    public IsoScelesTriangle(IsoScelesTriangle isoScelesTriangle) {
        this(isoScelesTriangle.getHeight(), isoScelesTriangle.getWidth(), isoScelesTriangle.getX(), isoScelesTriangle.getY());
    }

    @Override
    public void setWidth(int width) {
        this.setPerpendicular(width/2);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
        super.setWidth(this.getPerpendicular()*2);
    }

    public static int getCount() {
        return count;
    }

}
