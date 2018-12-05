package extraexercises.project_eurler;

public class Problem06_SumSquareDifference {
    /*
        The sum of the squares of the first ten natural numbers is,
        1² + 2² + ... + 10² = 385

        The square of the sum of the first ten natural numbers is,
        (1 + 2 + ... + 10)² = 55² = 3025

        Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

        Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */
    public static void main(String[] args) {
        int sumSquares = 0 ;
        for (int i = 1; i <= 100; i++) {
            sumSquares += i*i;
        }

        int squareSum = 0;
        for (int i = 1; i <= 100 ; i++) {
            squareSum += i;
        }
        squareSum *= squareSum;
        System.out.println(squareSum - sumSquares);
    }
}
