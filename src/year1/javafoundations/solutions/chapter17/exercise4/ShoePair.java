package year1.javafoundations.solutions.chapter17.exercise4;

public class ShoePair implements Pair<Shoe> {
    private Shoe left;
    private Shoe right;

    @Override
    public Shoe getLeft() {
        return left;
    }

    @Override
    public Shoe getRight() {
        return right;
    }

    @Override
    public void setLeft(Shoe left) {
        this.left = left;
    }

    @Override
    public void setRight(Shoe right) {
        this.right = right;
    }
}
