package sa;

public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int max = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            maxSum = maxSum + arr[i];
            if (maxSum < 0) {
                maxSum = 0;
            }
            if (maxSum > max) {
                max = maxSum;
            }
        }
        System.out.println(max);
    }
}
