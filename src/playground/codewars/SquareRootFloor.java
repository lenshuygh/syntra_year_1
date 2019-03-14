package playground.codewars;

public class SquareRootFloor {
    public static void main(String[] args) {
        System.out.println(integerSquareRoot("5"));
    }

    public static String integerSquareRoot(String n) {

        return ""+(int)Math.sqrt(Double.parseDouble(n));
    }
}


/*

idea's

for-i-loop on all positions

dividing by 2

original decreases and result increases and they grow move towards each other......

------------

divide big num into smaller nums that can we can get the square root of



-------------

square factors ->

root of 400 is root of 16*25 is 4 * 5 = 20

-------------





 */
/*
Task
For each given a number N, the integer S is called integer square root of N if S x S <= N and (S+1) x (S+1) > N.

In other words, S = Math.floor(Math.sqrt(N))

Your task is to calculate the integer square root of a given Number.

Note: Input is given in string format. That is, the Number may be very very large ;-)

Example
For: Number = "4", result = "2".

For: Number = "17", result = "4".

For: Number = "101", result = "10".

For: Number = "23232328323215435345345345343458098856756556809400840980980980980809092343243243243243098799634", result = "152421548093487868711992623730429930751178496967".

Input/Output
[input] string Number

number in decimal form. 0 < Number < 10^100

[output] a string

integer squareroot of Number.

Note for Java users
To make this kata worth its rank, some APIs are not allowed in your Java solution. Solution file will be searched (with case-insensitive search) for occurences of following strings: reflection, biginteger, bigdecimal, runtime, process, script, and will be rejected if any is found, even in comments!
 */
