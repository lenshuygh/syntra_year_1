package year1.basicprogramming.solutions.assignment;

/**
 * Created by JonathanSyntra on 7/11/2018.
 */
public class exercise2 {
    public static void main(String[] args) {
        System.out.println("Can a triangle be formed with 5, 3, 12: " + isTriangle(5, 3, 12));
        System.out.println("Can a triangle be formed with 2, 1, 3: " + isTriangle(2, 1, 3));
        System.out.println("Can a triangle be formed with 2, 2, 2: " + isTriangle(2, 2, 2));
        System.out.println("Can a triangle be formed with 4, 7, 1: " + isTriangle(4, 7, 1));
        System.out.println("Can a triangle be formed with 4, 2, 1: " + isTriangle(4, 2, 1));
    }

    public static boolean isTriangle(int sideA, int sideB, int sideC){
        return sideA <= sideB + sideC
                && sideB <= sideA + sideC
                && sideC <= sideA + sideB;
    }
}
