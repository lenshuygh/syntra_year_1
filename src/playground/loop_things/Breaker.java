package playground.loop_things;

public class Breaker {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            for (char c = 'a';c <= 'z';c++){
                System.out.print((char) c);
                if (c == 'r'){
                    break;
                }
            }
            System.out.println();
        }
    }
}
