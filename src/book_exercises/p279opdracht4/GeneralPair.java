package book_exercises.p279opdracht4;

public class GeneralPair<E> implements Pair<E> {
    private E left;
    private E right;

    public GeneralPair(E left, E right) {
        this.left = left;
        this.right = right;
    }

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
