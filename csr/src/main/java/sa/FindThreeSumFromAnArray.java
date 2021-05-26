package sa;
/*
Find triplets with zero sum
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindThreeSumFromAnArray {
    public static void main(String[] args) {
//        int arr[] = {0, -1, 2, -3, 1};
//        int arr[] = {-1, 0, 1, 2, -1, -4};
        int arr[]={-2,0,1,1,2};

        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(arr);
//        Arrays.stream(arr).forEach(System.out::println);

        for (int i = 0; i < arr.length - 2; i++) {
            List<Integer> out = new ArrayList<>();
            int l = i + 1;
            int r = arr.length - 1;
            int x = arr[i];

            while (l < r) {
                int sum = x + arr[l] + arr[r];
                if (sum == 0) {

                    out.add(x);
                    out.add(arr[r]);
                    out.add(arr[l]);
//                    break;
                    l++;
                    r--;

                } else if (sum < 0) {
                    l++;
                } else if (sum > 0) {
                    r--;
                }
            }
            if (out.size() > 0) {
                set.add(out);
            }
        }
        set.stream().forEach(System.out::println);

    }
}
