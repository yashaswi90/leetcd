package sa;

import java.util.Stack;

public class CheckBalancedParenthesis {
    public static void main(String[] args) {
//        System.out.println(isValid("()"));
//        System.out.println(isValid("([])"));
//        System.out.println(isValid("(){"));
//        System.out.println(isValid("(]"));
//        System.out.println(isValid("{([ {}])}"));
        System.out.println(isValid("{[}]"));

    }

    private static boolean isValid(String s) {
        Stack stack = new Stack();

        char[] validParanChar = s.toCharArray();
        if (validParanChar.length <= 1) {
            return false;
        } else {
            for (int i = 0; i < validParanChar.length; i++) {
                if (validParanChar[i] == '{' || validParanChar[i] == '[' || validParanChar[i] == '(' || validParanChar[i] == '<') {
                    stack.push(validParanChar[i]);
                } else if (validParanChar[i] == '}') {
                    if (stack.peek().equals('{')) {
                        stack.pop();
                    }
                } else if (validParanChar[i] == ']') {
                    if (stack.peek().equals('[')) {
                        stack.pop();
                    }
                } else if (validParanChar[i] == '>') {
                    if (stack.peek().equals('<')) {
                        stack.pop();
                    }
                } else if (validParanChar[i] == ')') {
                    if (stack.peek().equals('(')) {
                        stack.pop();
                    }
                }

            }
        }
        if (stack.size() != 0) {
            return false;
        }
        else{
            return true;
        }
    }
}
