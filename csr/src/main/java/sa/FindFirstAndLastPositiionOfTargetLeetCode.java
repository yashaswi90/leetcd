package sa;

import java.util.Arrays;

public class FindFirstAndLastPositiionOfTargetLeetCode {
    public static int[] searchRange(int[] nums, int target) {

        int[] out = new int[]{-1, -1};
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                if (!flag) {
                    out[0] = i;
                    flag = true;
                }
            }

            if (i + 1 < nums.length) {
                if (nums[i] == target && nums[i + 1] != target) {
                    if (flag) {
                        out[1] = i;
                        break;
                    }
                }
            }else {
                if(!flag){
                    break;
                }
                out[1] = i;
            }

        }
        return out;
    }

    public static void main(String[] args) {

//        int nums[] = {1};
        int nums[] = {5, 7, 7, 8, 8, 8};


        Arrays.stream(searchRange(nums, 8)).forEach(System.out::println);
    }
}
