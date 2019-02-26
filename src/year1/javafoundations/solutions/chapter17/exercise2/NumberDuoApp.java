package year1.javafoundations.solutions.chapter17.exercise2;

public class NumberDuoApp {
    public static void main(String[] args) {
        //NumberDuo<Number> numberDuo = new NumberDuo<Integer>(5,6);
        NumberDuo<?> numberDuo = new NumberDuo<Integer>(5,6);
        //Integer first = numberDuo.getFirst();
        Number first = numberDuo.getFirst();
    }
}
