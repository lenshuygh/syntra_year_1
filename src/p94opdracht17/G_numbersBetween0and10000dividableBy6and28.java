package p94opdracht17;

public class G_numbersBetween0and10000dividableBy6and28 {
    public static void main(String[] args) {
        int product = 6 *8;
        for (int i = 0; i < 100_000; i++) {
            //System.out.println((i % product == 0) ? i : "");
            if(i % product == 0){
                System.out.println(i);
            }

        }
    }
}
