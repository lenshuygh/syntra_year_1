package p194opdracht7;

public class IsoSelesTriangle extends Triangle{
    private static int count;

    {
        count++;
    }

    public IsoSelesTriangle(){
        this(0,0);
    }
    public IsoSelesTriangle(int width,int height){
       this(width,height,0,0);
    }
    public IsoSelesTriangle(int width,int height,int x,int y){
        setWidth(width);
        setHeight(height);
        setX(x);
        setY(y);
    }

    public IsoSelesTriangle(IsoSelesTriangle isoSelesTiangle){
        this(isoSelesTiangle.getWidth(),isoSelesTiangle.getHeight(),isoSelesTiangle.getX(),isoSelesTiangle.getY());
    }

    @Override
    public void setWidth(int width) {
        this.setPerpendicular(width/2);
        /*
        super.setPerpendicular(width/2);
        super.setWidth(width);
        */
    }

    public void setPerpendicular(int perpendicular){
        super.setPerpendicular(perpendicular);
        super.setWidth(this.getPerpendicular()*2);
    }

    public static int getCount() {
        return count;
    }
}
