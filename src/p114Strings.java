public class p114Strings {
    public static void main(String[] args) {
        String w1 = "Hello World";
        String w2 = "Hello World";
        String w3 = new String("Hello World");
        String w4 = new String("Hello World");
        String w5 = w3;
        String w6 = new String(w3);

        System.out.println(w1 == w2);
        System.out.println(w1 == w3);
        System.out.println(w3 == w4);
        System.out.println(w5 == w3);
        System.out.println();
        System.out.println(w1.equals(w2));
        System.out.println(w1.equals(w3));
        System.out.println(w1.equals(w4));
        System.out.println(w1.equals(w5));
        System.out.println();
        System.out.println(w6 == w3);
        System.out.println();
    }
}
