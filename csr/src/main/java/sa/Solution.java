package sa;

import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=1;

        Arrays.sort(nums);
        if(nums.length==1 && nums[nums.length-1]>=1 &&  nums[nums.length-1]<2){
            return i+1;
        }
        for (i = 1; i <=nums.length; i++) {

            if(nums[i-1]==i){
                continue;
            }else if(nums[i-1]==0) {
                continue;
            }else{
                return i;
            }



        }
        return i;
    }

    public static void main(String[] args) {
        int[] num = {1,2,0};
        Solution solution = new Solution();
        System.out.println(solution.firstMissingPositive(num));
    }

}