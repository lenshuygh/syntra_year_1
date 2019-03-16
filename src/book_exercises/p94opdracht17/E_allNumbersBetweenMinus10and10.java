package book_exercises.p94opdracht17;

public class E_allNumbersBetweenMinus10and10 {
    public static void main(String[] args) {
        for (int i = -10; i <= 10 ; i++) {
            if(i > 0){
                System.out.print("+");
            }
            System.out.println(i);
        }
    }

}
