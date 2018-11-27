package playground.chainingmethods;

public class ChainingMethods {
    public static void main(String[] args) {
        Stringer stringer = new Stringer("Dit");
        stringer.add("is");
        stringer.add("een voorbeeld");
        System.out.println(stringer);

        Stringer s = new Stringer("Zo");
        System.out.println(s.add("kan").add("het").add("ook").add("!"));
    }
}
