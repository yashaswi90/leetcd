package sa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazonQues2 {

    public static void main(String[] args) {
        System.out.println(numberOfItems("|**|*|*", Arrays.asList(1,1),Arrays.asList(5,6)));
    }

    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        int[] mem = new int[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '|') {
                mem[i] = count;
            } else {
                ++count;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < startIndices.size(); ++i) {
            int start = startIndices.get(i) - 1;
            int end = endIndices.get(i) - 1;

//            while (start < end && s.charAt(start) != '|') ++start;
//            while (start < end && s.charAt(end) != '|') --end;
            while (start < end && s.charAt(start) != '|') ++start;
            while (start < end && s.charAt(end) != '|') --end;

            ans.add(mem[end] - mem[start]);
        }
        return ans;
    }
}
