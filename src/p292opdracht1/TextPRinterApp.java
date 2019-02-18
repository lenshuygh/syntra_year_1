package p292opdracht1;

public class TextPRinterApp {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("dit is een zin of nieeeeeet een zin, aap, vierrr");
        System.out.println("contains 'a'");
        textPrinter.printValidWords(s -> s.contains("a"));
        System.out.println("lettercount +4");
        textPrinter.printValidWords(s -> s.length() > 4);
    }
}
