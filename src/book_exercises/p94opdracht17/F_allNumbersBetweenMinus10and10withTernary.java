package book_exercises.p94opdracht17;

public class F_allNumbersBetweenMinus10and10withTernary {
    public static void main(String[] args) {
        for (int i = -10; i <= 10 ; i++) {
            System.out.println((i > 0) ? "+"+i : i);
        }
    }

}
