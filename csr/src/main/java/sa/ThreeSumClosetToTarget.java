package sa;

import static java.lang.Math.abs;

import java.util.Arrays;

public class ThreeSumClosetToTarget {


    public static  int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff= Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){

            int first = i;
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[first]+nums[left]+nums[right];
                if(abs(target-sum)<abs(diff)){
                    diff=target-sum;
                }
                if(sum<target){
                    left++;
                }else{
                    right--;
                }

            }
        }
        return target-diff;



    }

    public static void main(String[] args) {
        int arr[]= {-1,2,1,-4};
        int target =1;

        System.out.println(threeSumClosest(arr,target));

    }
}
