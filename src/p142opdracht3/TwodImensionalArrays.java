package p142opdracht3;

public class TwodImensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[4][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i+1) * (j+1);
            }
        }
        for (int[] rij : matrix) {
            for (int kolom : rij) {
                System.out.printf("%-10d", kolom);
            }
            System.out.println();
        }
    }
}
