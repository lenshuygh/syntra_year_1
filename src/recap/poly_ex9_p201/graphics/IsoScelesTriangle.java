package recap.poly_ex9_p201.graphics;

public class IsoScelesTriangle extends Triangle {
    private static int count;
    public  final String description = super.description + " (IsoTriangle)";

    {
        count = 0;
    }

    public IsoScelesTriangle(){
        this(0,0);
    }

    public IsoScelesTriangle(int width,int height){
        this(width,height,0,0);
    }

    public IsoScelesTriangle(int width,int height,int x,int y){
        setWidth(width);
        setHeight(height);
        setPosition(x, y);
        count++;
    }

    public IsoScelesTriangle(IsoScelesTriangle isoScelesTriangle){
        setWidth(isoScelesTriangle.getWidth());
        setHeight(isoScelesTriangle.getHeight());
        setPosition(isoScelesTriangle.getX(),isoScelesTriangle.getY());
    }

    public static int getCount(){
        return count;
    }
}
