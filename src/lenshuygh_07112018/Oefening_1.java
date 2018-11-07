package lenshuygh_07112018;

public class Oefening_1 {
    public static void main(String[] args) {
        System.out.println(isDivisible(4,2));
        System.out.println(isDivisible(-3,1));
        System.out.println(isDivisible(5,-1));
        System.out.println(isDivisible(10,3));
        System.out.println(isDivisible(2,5));
        System.out.println(isDivisible(4,0));
        System.out.println(isDivisible(0,2));
    }

    private static boolean isDivisible(int number, int divider) {
        if(number == 0 || divider == 0){
            return false;
        }
        return number % divider == 0;
    }
}
