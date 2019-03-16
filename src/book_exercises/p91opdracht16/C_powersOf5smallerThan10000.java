package book_exercises.p91opdracht16;

public class C_powersOf5smallerThan10000 {
    public static void main(String[] args) {
        int num = 5;
        while((num *= 5) < 10000){
            System.out.println(num);
        }
    }
}
