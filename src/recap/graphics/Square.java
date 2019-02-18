package recap.graphics;

public class Square extends Rectangle {
    private static int count;
    public  final String description = super.description + " (Square)";

    {
        count = 0;
    }

    public Square(){
        this(5);
    }

    public Square (int side){
        this(side,0,0);
    }

    public Square(Square square){
        this(square.getSide(),square.getX(),square.getY());
    }

    public Square(int side,int x,int y){
        setSide(side);
        setX(x);
        setY(y);
        count++;
    }

    public void setSide(int side){
        setHeight(side);
        setWidth(side);
    }

    public int getSide(){
        return getWidth();
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    public static int getCount(){
        return count;
    }
}
