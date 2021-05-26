package sa;

import java.util.Arrays;

public class RemoveDuplicatesFromAnArrayInPlace {
    public static int removeDuplicates(int[] nums) {


        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
        /*

        int i = 0;
        int count = 0;
        int n = nums.length;
        while (i < n) {
            if (i + 1 < n) {
                if (nums[i] == nums[i + 1]) {
                    nums[i] = -1;
                    count++;
                }
            } else {
                break;
            }

            i++;
        }
        int j = 0;
        while (j < n) {
            if (nums[j] == -1) {
                if (nums[n - 1] == -1) {
                    n--;
                } else {
                    int temp = nums[j];
                    nums[j] = nums[n - 1];
                    nums[n - 1] = temp;
                    j++;
                }
            } else {
                j++;
            }
        }
        Arrays.sort(nums, 0, nums.length - count);

        return Arrays.copyOfRange(nums, 0, nums.length - count);*/
    }


    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        Arrays.stream(removeDuplicates(nums)).forEach(System.out::println);

        System.out.println(removeDuplicates(nums));
    }
}
