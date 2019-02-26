package year1.javafoundations.solutions.chapter17.exercise4;

public class GeneralPair <E> implements Pair<E> {
    private E left;
    private E right;

    @Override
    public E getLeft() {
        return left;
    }

    @Override
    public E getRight() {
        return right;
    }

    @Override
    public void setLeft(E left) {
        this.left = left;
    }

    @Override
    public void setRight(E right) {
        this.right = right;
    }
}
