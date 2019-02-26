package year1.javafoundations.solutions.chapter17.exercise4;

public interface Pair<E> {
    E getLeft();
    E getRight();

    void setLeft(E left);
    void setRight(E right);

    default void swap(){
        E temp = getLeft();
        setLeft(getRight());
        setRight(temp);
    }
}
