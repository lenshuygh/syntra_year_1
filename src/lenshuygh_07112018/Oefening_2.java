package lenshuygh_07112018;

public class Oefening_2 {
    public static void main(String[] args) {
        System.out.println(isTriangle(1,2,3));
        System.out.println(isTriangle(4,1,8));
        System.out.println(isTriangle(1,4,8));
        System.out.println(isTriangle(8,1,4));
        System.out.println(isTriangle(8,4,1));
        System.out.println(isTriangle(10,13,9));
        System.out.println(isTriangle(1,2,1));
    }

    private static boolean isTriangle(int a, int b, int c) {
        return !((a > b + c) || (b > a + c) || (c > a + b));
    }
}
