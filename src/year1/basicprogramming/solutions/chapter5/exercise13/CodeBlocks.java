package year1.basicprogramming.solutions.chapter5.exercise13;

/**
 * Created by JonathanSyntra on 15/10/2016.
 */
public class CodeBlocks {
    static String hello = "wut?";
    public static void main(String[] args) {
        String hello = "Bye!";
        {
            System.out.println(hello);
        }
        newF();
    }

    public static void newF(){
        System.out.println(hello);
    }
}
