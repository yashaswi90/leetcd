package sa;

import java.util.Stack;

public class LongestValidParanthesisLeetCode {
    public static int longestValidParentheses(String s) {
        char[] ch = s.toCharArray();


        Stack<Character> stack = new Stack<>();
        int maxCount = 0;
        int count =0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ')') {
                if (stack.isEmpty()) {
                    count=0;
                    continue;
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();

                        count = count+2;
                    }
                }
            } else {
                stack.push(ch[i]);
            }
        }
        return count;

    }

    public static void main(String[] args) {
//        String s = ")()())";
//        String s = "(()";
//        String s = "";
        String s = "()(()";


        System.out.println(longestValidParentheses(s));

    }

}
