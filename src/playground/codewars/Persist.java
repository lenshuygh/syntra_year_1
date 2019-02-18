package playground.codewars;

public class Persist {
    public static void main(String[] args) {
        long n = 73074;
        System.out.println(getNums(n));
    }

    private static int getNums(long n) {
        long prod = 10;
        int count = 0;
        while ((prod > 9) && (n > 9)) {
            prod = 1L;
            String nums = String.valueOf(n);
            System.out.println("nums : " + nums + '|');
            char[] digits = nums.toCharArray();
            for (char digit : digits) {
                System.out.print(digit + " - ");
                    prod *= Integer.parseInt("" + digit);
            }
            System.out.println("prod: " + prod);
            System.out.println();
            n = prod;
            count++;
        }
        return count;
    }
}
