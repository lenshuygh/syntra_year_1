package playground.codewars;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NParasiticNumbersEndingInN {
    public static void main(String[] args) {
        int octal = 015;
        System.out.println("octal: " +octal);
        System.out.println();
        //System.out.println(calculateSpecial(4, 10));

        System.out.println(isParasitic(0x104));
    }

    public static String calculateSpecial(int lastDigit, int radix) {
        final String prefix;
        switch (radix) {
            case 8:
                prefix = "0";
                break;
            case 16:
                prefix = "0e";
                break;
            default:
                prefix = "";
        }

        OptionalInt res = IntStream.rangeClosed(0, Integer.MAX_VALUE)
                .mapToObj(String::valueOf)
                .map(s -> prefix + s)
                .mapToInt(Integer::new)
                .filter(s -> s % 10 == lastDigit)
                .filter(s -> isParasitic(s))
                .findFirst();
        return "" + res.getAsInt();
    }

    private static boolean isParasitic(int numString) {
        String numStringA = "" + numString;
        boolean result = false;
        String digit = numStringA.substring(numStringA.length() - 1);
        if ("0".equals(digit) || "1".equals(digit)) {
            return false;
        } else {
            String newNum = digit + numStringA.substring(0, numStringA.length() - 1);
            int digitNumber = Integer.parseInt(digit);
            int originalNumber = Integer.parseInt(numStringA);
            int newNumber = Integer.parseInt(newNum);
            int prod = newNumber * digitNumber;

            if (originalNumber * digitNumber == newNumber) {
                return true;
            }
        }
        return result;
    }
}

/*
This challenge is to compute a special set of parasitic numbers for various number bases.

An n-parasitic number (in base 10) is a positive natural number which can be multiplied by n by moving the rightmost
 digit of its decimal representation to the front. Here n is itself a single-digit positive natural number.
 In other words, the decimal representation undergoes a right circular shift
 by one place. For example, 4•128205=512820, so 128205 is 4-parasitic

This Kata's Special Set of Parasitic Numbers
For some N there may be multiple N-parasitic numbers. This Kata is concerned with finding a special set
of parasitic numbers where the trailing digit is also the 'N' in the N-parasitic number. In base-10,
the above Wikipedia excerpt shows that 128205 is 4-parasitic since 4 • 128205 = 512820; however,
the special number this Kata is looking for is the smallest 4-parasitic number that also ends
in 4, which is 102564: 4 • 102564 = 410256.

Challenge
Provide a method accepting two arguments: the special trailing digit and a number base. Your method
should return the string representation of the smallest integer having the special parasitic number
property as described above in the requested number-base (octal, decimal and hex.) Each number base
will test for all trailing digits other than 0 and 1, giving a total of 28 test cases.

Why the smallest?
Consider how the special 4-parastic HEX number ending in 4 is 104.

104 Hex • 4 = 410 Hex.

Repeating 104 twice and multiplying by 4 gives us 104104 Hex • 4 = 410410 Hex. This property holds
regardless of how many times the set of digits is repeated (e.g., 104104 Hex • 4 = 410410 Hex,
104104104 Hex • 4 = 410410410 Hex, 104104104104 Hex • 4 = 410410410410 Hex, ...), leading to an
infinite set of these special numbers in each case. Your task is to find only the smallest number
that satisfies the special parasitic property. [This fact is a hint on one possible way to solve this problem.]

Hints:
Unless you can be clever about it, brute force techniques probably won't work.
An answer exists satisfying the criteria for each of the trailing-digits tested.
Leading zero-digits are not allowed.
Test failures will reveal the inputs rather than the expected value.
###After you have solved it: Can you find two other algorithmically different approaches to
solve this puzzle? The refrence solutions in javascript, c# and python solve the
puzzle in fundamentally different ways.
 */
