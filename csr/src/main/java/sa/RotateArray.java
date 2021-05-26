package sa;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */

public class RotateArray {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] temp = new int[input.length];
        int k = 3;
        int diff = (input.length - 1) - k;


        for (int i = diff + 1, j = 0; i < input.length && j < k; i++, j++) {
            temp[j] = input[i];
        }
        for (int i = 0, j = k; i <= diff; i++, j++) {
            temp[j] = input[i];
        }
        Arrays.stream(temp).forEach(System.out::println);

    }
}
