package p194opdracht7;

public class IsoSelesTiangle extends Triangle{
    private static int count;

    {
        count++;
    }

    public IsoSelesTiangle(){
        this(0,0);
    }
    public IsoSelesTiangle(int width,int height){
       this(width,height,0,0);
    }
    public IsoSelesTiangle(int width,int height,int x,int y){
        setWidth(width);
        setHeight(height);
        setX(x);
        setY(y);
    }

    public IsoSelesTiangle(IsoSelesTiangle isoSelesTiangle){
        setWidth(isoSelesTiangle.getWidth());
        setHeight(isoSelesTiangle.getHeight());
        setX(isoSelesTiangle.getX());
        setY(isoSelesTiangle.getY());
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    public void setPerpendicular(int perpendicular){
        super.setPerpendicular(perpendicular);
    }

    public static int getCount() {
        return count;
    }
}
