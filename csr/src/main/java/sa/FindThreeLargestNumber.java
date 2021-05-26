package sa;

/*Given an input array of integers with negative value also, int[] inputData = {4, 7, -2. 9, 1}
 * Find out the three largest numbers from the given array without sorting.
 *
 * output[] = {4, 7, 9}
 * */

import java.util.Arrays;

public class FindThreeLargestNumber {
    public static void main(String[] args) {
//        int input[] = new int[]{4, 7, -2, 9, 1};
        int input[] = new int[]{4, 6, 18, 42, 99,55, 33, -2, 21, 11, 9, 20, -8, 14};
        int output[] = new int[3];
        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > first) {
                int temp = third;
                third = second;
                second = first;
                first = input[i];
            } else if (input[i] > second) {
                int temp = third;
                third = second;
                second = input[i];
            } else if (input[i] > third) {
                third = input[i];
            }

        }
        output[0] = first;
        output[1] = second;
        output[2] = third;

        Arrays.stream(output).forEach(System.out::println);
    }
}
