package playground.codewars;

import java.math.BigInteger;
import java.sql.Time;
import java.time.LocalTime;
import java.time.Period;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LastDigitsOfNisN {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        System.out.println(get(13));
        LocalTime end = LocalTime.now();
        System.out.println("start: " + start);
        System.out.println("end: " + end);
        runTest();
    }

    private static void runTest() {
        System.out.println("12 -> " + makeSquare(12));
        System.out.println("112 -> " + makeSquare(112));
        System.out.println("5212 -> " + makeSquare(5212));
        System.out.println("35212 -> " + makeSquare(35212));
    }

    private static int makeSquare(int i) {
        return (int) Math.pow(i,2);
    }

    public static BigInteger get(int n) {
        //int num = 0;
        BigInteger num = BigInteger.ZERO;
        int count = 0;
        Set<BigInteger> checkSet = new HashSet<>(Arrays.asList(BigInteger.valueOf(0), BigInteger.valueOf(1), BigInteger.valueOf(5), BigInteger.valueOf(6)));
        do {
            num = num.add(BigInteger.ONE);
            //num++;
            if (endsWithRoot(num, checkSet)) {
                count++;
                System.out.println(count);
            }
        } while (count < n);

        return num;
        //return BigInteger.valueOf(num);
    }

    private static boolean endsWithRoot(int num, Set<Integer> checkSet) {
        if (checkSet.contains(num % 10)) {
            BigInteger testBigInteger = BigInteger.valueOf(num);
            BigInteger powBigInteger = testBigInteger.pow(2);
            String powBigIntegerString = powBigInteger.toString();
            String numString = String.valueOf(num);
            int powLength = powBigIntegerString.length();
            int numLength = numString.length();

            if (powLength == numLength) {
                if (powBigInteger.compareTo(BigInteger.valueOf(num)) == 0) {
                    return true;
                } else {
                    return false;
                }
            }
            String ending = powBigIntegerString.substring(powLength - numLength, powLength);
            if (ending.equals(numString)) {
                return true;
            }
        }
        return false;
    }

    private static boolean endsWithRoot(BigInteger num, Set<BigInteger> checkSet) {
        if (checkSet.contains(num.mod(BigInteger.valueOf(10)))) {
            //start from end to front of the BigInteger

            Boolean x = calculateRootEndings(num);
            if (x != null) return x;
        }
        return false;
    }

    private static Boolean calculateRootEndings(BigInteger num) {
        BigInteger testBigInteger = num;
        BigInteger powBigInteger = testBigInteger.pow(2);
        String powBigIntegerString = powBigInteger.toString();
        String numString = String.valueOf(num);
        int powLength = powBigIntegerString.length();
        int numLength = numString.length();

        if (powLength == numLength) {
            if (powBigInteger.compareTo(num) == 0) {
                return true;
            } else {
                return false;
            }
        }
        String ending = powBigIntegerString.substring(powLength - numLength, powLength);
        if (ending.equals(numString)) {
            return true;
        }
        return false;
    }
}
