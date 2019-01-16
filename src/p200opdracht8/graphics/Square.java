package p200opdracht8.graphics;

/**
 * Created by JonathanSyntra on 5/12/2016.
 */
public class Square extends Rectangle {
    public final String description = super.description + " (square)";
    private static int count = 0;

    {
        count++;
    }

    public Square() {
        this(0);
    }

    public Square(int side) {
        this(0,0,side);
    }

    public Square(int x, int y, int side) {
        super(x, y, side, side);
    }

    public Square(Square square){
        this(square.getX(), square.getY(), square.getSide());
    }

    public void setSide(int side){
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide(){
        return getHeight();
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }

    public static int getCount() {
        return count;
    }
}
