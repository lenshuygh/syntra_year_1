package year1.basicprogramming.solutions.chapter5.exercise17;

/**
 * Created by JonathanSyntra on 23/10/2016.
 */
public class For5 {
    public static void main(String[] args) {
        for(int i = -10; i <= 10; i++){
            String result;
            if(i > 0){
                //System.out.println("+" + i);
                result = "+" + i;
            } else {
                //System.out.println(i);
                result = "" + i;
            }
            System.out.println(result);
        }
    }
}
