package playground.codewars;

public class SnailSort {

    public static void main(String[] args) {
        /*int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };*/
        int[][] grid = {
                {1, 2, 3 ,4},
                {12, 13, 14 ,5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };/*
        int[][] grid = {
                {1,2},{4,3}
        };*/
        int[] outArr = snail(grid);
        for (int i : outArr) {
            System.out.print(i + ",");
        }
    }

    public static int[] snail(int[][] array) {
        int verticalMax = array.length;
        int horizontalMax = array[0].length;
        int verticalMin = 0;
        int horizontalMin = 0;
        int[] out = new int[verticalMax * horizontalMax];
        int horizontalIndex = 0;
        int verticalIndex = 0;
        String direction = "right";

        for (int i = 0; i < out.length; i++) {
            switch (direction) {
                case "right":
                    if (horizontalIndex < horizontalMax) {
                        out[i] = array[verticalIndex][horizontalIndex];
                        horizontalIndex++;
                    } else {
                        direction = "down";
                        horizontalIndex--;
                        verticalIndex++;
                        verticalMin++;
                        out[i] = array[verticalIndex][horizontalIndex];
                        verticalIndex++;
                    }
                    break;
                case "down":
                    if(verticalIndex < verticalMax) {
                        out[i] = array[verticalIndex][horizontalIndex];
                        verticalIndex++;
                    }else {
                        direction = "left";
                        verticalIndex--;
                        horizontalIndex--;
                        horizontalMax--;
                        out[i] = array[verticalIndex][horizontalIndex];
                        horizontalIndex--;
                    }
                    break;
                case "left":
                    if(horizontalIndex >= horizontalMin) {
                        out[i] = array[verticalIndex][horizontalIndex];
                        horizontalIndex--;
                    }else {
                        direction = "up";
                        horizontalIndex++;
                        verticalIndex--;
                        verticalMax--;
                        out[i] = array[verticalIndex][horizontalIndex];
                        verticalIndex--;
                    }
                    break;
                case "up":
                    if(verticalIndex>=verticalMin) {
                        out[i] = array[verticalIndex][horizontalIndex];
                        verticalIndex--;
                    }else {
                        direction = "right";
                        verticalIndex++;
                        horizontalIndex++;
                        horizontalMin++;
                        out[i] = array[verticalIndex][horizontalIndex];
                        horizontalIndex++;
                    }
                    break;
            }
        }
        return out;
    }

}

/*
array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]


array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
 */
