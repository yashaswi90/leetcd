package sa;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumLeetCode {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                return new int[]{i,map.get(diff)};
            }
        }
return null;
    }

    public static void main(String[] args) {

        int []nums = {3,2,4};

        Arrays.stream(twoSum(nums,6)).forEach(System.out::println);

    }
}
