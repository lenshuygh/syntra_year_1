package p275opdracht2;

public class NumberDuoApp {
    public static void main(String[] args) {
        NumberDuo<Integer> numberDuo = new NumberDuo<>(50,5);
        System.out.println(numberDuo.getSum());

        NumberDuo<?> numberDuo1 = new NumberDuo<Integer>(4,9);
        System.out.println(numberDuo1.getSum());
    }
}