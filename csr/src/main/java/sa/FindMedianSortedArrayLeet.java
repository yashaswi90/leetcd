package sa;

import java.util.Arrays;

public class FindMedianSortedArrayLeet {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] thirdNum = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            thirdNum[i] = nums1[i];
        }

        for (int i = nums1.length,j=0; i < thirdNum.length&&j<thirdNum.length; i++,j++) {
            thirdNum[i] = nums2[j];
        }


        Arrays.sort(thirdNum);

        if (thirdNum.length % 2 == 0) {
            return (thirdNum[(thirdNum.length-1)/2]+thirdNum[(thirdNum.length)/2])/2;
        } else {
            return thirdNum[thirdNum.length / 2];
        }
    }

    public static void main(String[] args) {

        int num1[] = {1, 2};
        int nums2[] = {3,4};

        findMedianSortedArrays(num1, nums2);
    }
}
