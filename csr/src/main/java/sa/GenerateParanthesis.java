package sa;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrack(list, "", 0, 0, 3);
        return list;
    }

    public static void backTrack(List<String> list, String currentString, int open, int close, int max) {
        List<String> validParantheses = new ArrayList<>();
        if (currentString.length() == max * 2) {
            list.add(currentString);
            return;
        }
        if (open < max) {
            backTrack(list, currentString + "(", open + 1, close, max);
        }
        if (close < open) {
            backTrack(list, currentString + ")", open, close + 1, max);
        }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
    }
}
