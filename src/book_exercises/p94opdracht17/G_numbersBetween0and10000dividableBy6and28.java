package book_exercises.p94opdracht17;

public class G_numbersBetween0and10000dividableBy6and28 {
    public static void main(String[] args) {
        int product = 6 *8;
        int numberOfResults = 0;
        /*for (int i = 0; i < 100_000; i++) {
            if(i % product == 0){
                System.out.println(i);
                numberOfResults++;
            }

        }*/

        for (int i = 0; i < 100_000; i+=product) {
            numberOfResults++;
            System.out.println(i);
        }
        System.out.println("numberOfResults = " + numberOfResults);
    }
}
