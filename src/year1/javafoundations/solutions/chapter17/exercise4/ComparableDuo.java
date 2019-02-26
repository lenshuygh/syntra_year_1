package year1.javafoundations.solutions.chapter17.exercise4;

public class ComparableDuo<E extends Comparable<E>> extends Duo<E>{

    public ComparableDuo(E first, E second) {
        super(first, second);
    }

    public E getHighest(){
        return (getFirst().compareTo(getSecond()) < 0 ? getSecond() : getFirst());
    }

    public E getLowest(){
        return (getFirst().compareTo(getSecond()) <= 0 ? getFirst() : getSecond());
    }
}
