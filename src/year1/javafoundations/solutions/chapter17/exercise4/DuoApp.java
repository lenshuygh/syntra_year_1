package year1.javafoundations.solutions.chapter17.exercise4;

public class DuoApp {
    public static void main(String[] args) {
        ComparableDuo<String> comparableDuo = new ComparableDuo<>("Hello","World");
        System.out.println(comparableDuo.getHighest());
        System.out.println(comparableDuo.getLowest());
    }
}
