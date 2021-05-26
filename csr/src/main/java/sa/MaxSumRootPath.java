/*
package sa;

import java.util.Arrays;

public class MaxSumRootPath {
        private static int maxSum = 0;
        private static int[] arr;

        public static void maxSumPath(Node root, int[] path) {
            maxSum = Integer.MIN_VALUE;
            maxSumPathRoot2Leaf(root, path, 0, 0);
            System.out.println("Maximum Sum :" + maxSum);
            System.out.println("Root to Leaf Path: " + Arrays.toString(arr));
        }

        public static void maxSumPathRoot2Leaf(Node root, int[] path, int index, int sum) {
            if (null == root) {
                return;
            }
            path[index++] = root.data;
            sum += root.data;
            if (root.left == null && root.right == null) {
                if (sum > maxSum) {
                    maxSum = sum;
                    arr = Arrays.copyOf(path, index);
                }
                return;
            }
            maxSumPathRoot2Leaf(root.left, path, index, sum);
            maxSumPathRoot2Leaf(root.right, path, index, sum);
            return;
        }

}
*/
