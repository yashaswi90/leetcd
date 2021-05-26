package sa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TotalStablePeriods {
    public static void main(String[] args) {

        int A[] = new int[]{-1, 1, 3, 3, 3, 2, 3, 2, 1, 0};
        System.out.println(countAllPeriods(A));

    }
        private static int countAllPeriods(int[] arr) {
            int[] pre = new int[arr.length];
            for(int i=1;i<arr.length;i++) {
                pre[i] = arr[i] - arr[i-1];
            }
            Set<List<Integer>> res = new HashSet<>();
            int tmp = 0, r = 0;
            for(;r<pre.length-1;r++) {
                tmp = r;
                while(tmp < pre.length-1 && pre[tmp] == pre[tmp+1]) {
                    res.add(Arrays.asList(r, tmp+1));
                    tmp++;
                }
            }
            return res.size();
        }
}
