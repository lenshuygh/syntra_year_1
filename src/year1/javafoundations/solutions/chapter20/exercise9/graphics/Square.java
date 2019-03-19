package year1.javafoundations.solutions.chapter20.exercise9.graphics;

/**
 * Created by JonathanSyntra on 5/12/2016.
 */
public class Square extends Rectangle {
    public final String description = super.description + " (square)";
    private static int count = 0;

    {
        count++;
    }

    public Square() throws NegativeSizeException {
        this(0);
    }

    public Square(int side) throws NegativeSizeException {
        this(0,0,side);
    }

    public Square(int x, int y, int side) throws NegativeSizeException {
        super(x, y, side, side);
    }

    public Square(Square square) throws NegativeSizeException {
        this(square.getX(), square.getY(), square.getSide());
    }

    public void setSide(int side) throws NegativeSizeException {
        super.setHeight(side);
        super.setWidth(side);
    }

    public int getSide(){
        return getHeight();
    }

    @Override
    public void setHeight(int height) throws NegativeSizeException {
        super.setHeight(height);
    }

    @Override
    public void setWidth(int width) throws NegativeSizeException {
        super.setWidth(width);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Square{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        if (!super.equals(o)) return false;

        Square square = (Square) o;

        return description != null ? description.equals(square.description) : square.description == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
