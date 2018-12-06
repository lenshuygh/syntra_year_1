package extraexercises.project_euler;

public class Problem04_LargestPalindromeProduct {
    public static void main(String[] args) {
        /*
        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

        Find the largest palindrome made from the product of two 3-digit numbers.
        */
        int res = 0;
        int biggest = 0;


        for (int i = 999; i > 99 ; i--) {
            for (int j = 999; j > 99; j--) {
                res = i * j;
                if (isPalindrome(res)) {
                    if(res > biggest){
                        biggest = res;
                    }
                }
            }

        }
        System.out.println("biggest palindrom = " + biggest);
    }

    private static boolean isPalindrome(int number) {
        int[] arr = new int[6];
        int multiplier = 0;
        int rest = 0;
        for (int i = 5; i >= 0 ; i--) {
            rest = number % 10;
            arr[i] = rest;
            number -= rest;
            number /= 10;
        }
        int c1 = 0;
        int c2 = 5;
        while (c2 > c1){
            if(arr[c1] != arr[c2]){
                return false;
            }
            c1++;
            c2--;
        }
        return true;
    }
}
