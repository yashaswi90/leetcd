package sa;

public class JumpCaseLeetCode {
//    public static boolean canJump(int[] nums) {
//        for (int i = 1; i <= nums.length; ) {
//
//            if (nums.length - 1 < 1) {
//                return true;
//            }
//
//            if ((nums[i] == 0) && (i + nums[i] != nums.length - 1)) {
//                return false;
//            }
//            i = i + nums[i];
//            if (i == nums.length - 1) {
//                return true;
//            } else {
//                continue;
//            }
//        }
//        return false;
//    }

   /*  static boolean canJump(int[] nums) {
         int lastPos = nums.length - 1;
         for (int i = nums.length - 1; i >= 0; i--) {
             if (i + nums[i] >= lastPos) {
                 lastPos = i;
             }
         }
         return lastPos == 0;
//    }
     }*/


         static boolean canJump(int [] nums){
             int len = nums.length;
             int max = 0;
             for(int i=0; i<=max; i++){
                 max = Math.max(max, i+nums[i]);
                 if(max >= len-1)  return true;
             }
             return false;
//         }
//         }
}

    public static void main(String[] args) {
        int[] nums = {2,5,0,0};
        System.out.println(canJump(nums));
    }
}
