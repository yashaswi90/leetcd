package sa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindThreeSumWhoseSumIsZero {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {

            int first = i;
            int left = i + 1;
            int right = nums.length - 1;
            Set<Integer> out = new HashSet<>();
            while (left < right) {
                int sum = nums[first] + nums[left] + nums[right];

                if (sum < 0) {
                    right--;
                } else if (sum > 0) {
                    left--;
                } else {
                    if (sum == 0) {
                        list.add(nums[first]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                    }
                    if (list.size() > 0) {
                        out = new HashSet<>(list);
                    }

                }

            }

            List<Integer> outList = new ArrayList<>(out);

            lists.add(outList);

        }
        return lists;

    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
