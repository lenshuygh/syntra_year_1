package p292opdracht1;

public class TextPRinterApp {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter("dit is een zin of nieeeeeet een zin, Aap, vierrr");
        System.out.println("contains 'e':");
        textPrinter.printValidWords(s -> s.contains("e"));

        System.out.println("lettercount +4:");
        textPrinter.printValidWords(s -> s.length() > 4);

        System.out.println("starts with 'a':");
        textPrinter.printValidWords(s -> s.toLowerCase().startsWith("a"));

        System.out.println("Has 'e' as second letter:");
        textPrinter.printValidWords(s -> (s.startsWith("e",1)));
        //or teacher solution:
        System.out.println("------------------------------------------------");
        textPrinter.printValidWords(s -> s.length() > 1 && 'e' == s.charAt(1));

        System.out.println("Have two 'e's:");
        textPrinter.printValidWords(s -> ('e' == (s.charAt(s.indexOf("e")+1)) && 'e' != (s.charAt(s.indexOf("e")+2))));
        //or teacher solution:
        System.out.println("------------------------------------------------");
        textPrinter.printValidWords(s -> {
            int eCount = 0;
            for (char c : s.toCharArray()) {
                if('e' == c){
                    eCount++;
                }
            }
            return eCount == 2;
        });

    }
}
