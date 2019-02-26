package year1.javafoundations.solutions.chapter17.exercise3;

public class NumberDuo<E extends Number> extends Duo<E>{
    public NumberDuo(E first, E second) {
        super(first, second);
    }

    public double sum(){
        return getFirst().doubleValue() + getSecond().doubleValue();
    }
}
