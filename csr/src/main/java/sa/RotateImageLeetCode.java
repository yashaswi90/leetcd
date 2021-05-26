package sa;

import java.util.Arrays;

public class RotateImageLeetCode {
    public static int[][] rotate(int[][] matrix) {
        int out[][] = new int[matrix.length][matrix.length];
//        int j = 0, k = 0;

        int j = 0, k = 0;
        for (int l = 0; l < matrix.length; l++) {
            int i = matrix.length - 1;
            k = 0;
            for (; i >= 0; i--) {
                out[j][k] = matrix[i][j];
                k++;
            }
            j++;

        }
        return out;
    }

    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
//        int[][] matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7,8,9}};
//        System.out.println(Arrays.toString(matrix));matrix

        System.out.println(Arrays.deepToString(rotate(matrix)));
//        Arrays.stream(rotate(matrix)).flatMapToInt(s -> Arrays.stream(s)).forEach(System.out::print);
    }
}
