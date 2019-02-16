package p279opdracht4;

public class ComparableDuoApp {
    public static void main(String[] args) {
        ComparableDuo<String> comparableDuo = new ComparableDuo<>("AAAA","ZZZZZ");
        System.out.println(comparableDuo.getHighest());
        System.out.println(comparableDuo.getLowest());
    }
}
