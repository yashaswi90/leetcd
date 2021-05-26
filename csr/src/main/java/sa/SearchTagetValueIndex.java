package sa;

public class SearchTagetValueIndex {
    public static void main(String[] args) {
        /**
         * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
         * You may assume no duplicates in the array.
         * <p>
         * Input: [1,3,5,6], 5
         * Output: 2
         * <p>
         * Input: [1,3,5,6], 2
         * Output: 1
         * <p>
         * Input: [1,3,5,6], 7
         * Output: 4
         * <p>
         * Input: [1,3,5,6], 0
         * Output: 0
         */
        int[] input = new int[]{1, 3, 5, 6};
        int k = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == k) {
                System.out.println("index is :" + i);
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
