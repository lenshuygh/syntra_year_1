package book_exercises.p94opdracht17;

public class B_tableOf7SmallerThan200 {
    public static void main(String[] args) {
        for(int i = 0;i <= (200 / 7); i++){
            System.out.println(i*7);
        }

        //teacher solution
        System.out.println("-----------------");
        for (int i = 0; i < 200; i+=7) {
            System.out.println(i);
        }
    }
}
