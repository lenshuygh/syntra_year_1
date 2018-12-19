package year1.javafundamentals.solutions.chapter7.exercise3;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class TwoDArrays {
    public static void main(String[] args) {
        int[][] twoDArray = new int[4][6];
        for (int i = 0; i < twoDArray.length; i++) {
            int row = i + 1;
            for (int j = 0; j < twoDArray[i].length; j++) {
                int column = j + 1;
                twoDArray[i][j] = row * column;
            }
        }

        for (int[] nestedArray : twoDArray) {
            for (int number : nestedArray) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }
}
