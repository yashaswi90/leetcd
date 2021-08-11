package sa;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList();
            backtrack(candidates, 0, target, new ArrayList(), result);
            return result;
        }

        private void backtrack(int[] cand, int start, int target, List<Integer> list, List<List<Integer>> result) {
            if(target < 0)
                return;
            if(target == 0)
                result.add(new ArrayList(list));
            for(int i = start; i < cand.length; i++) {
                list.add(cand[i]);
                backtrack(cand, i, target - cand[i], list, result);
                list.remove(list.size() - 1);
            }
        }

    public static void main(String[] args) {
        CombinationSum combinationSum =new CombinationSum();
        System.out.println(combinationSum.combinationSum(new int[]{2,3,5,7},11));
    }
}
