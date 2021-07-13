package sa;

import java.util.Stack;

public class LongestValidParanthesisLeetCode {
    public static int longestValidParentheses(String s) {


        Stack<Integer> st= new Stack<>();
        int max=0;
        st.push(-1); // will pop if first charcter is ')'
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }else{
                st.pop(); // we pushed -1 to execute this line specially if the first charcter is ')'.
                if(st.isEmpty()){// in the case where current character is ')' and there is no other element pushed [think for string "()())"]
                    st.push(i);
                }
                else{
                    int count= i-st.peek(); // find the difference to get the length
                    max=Math.max(count,max);
                }
            }

        }
        return max;
    }

//    }

     /*   char[] ch = s.toCharArray();


        Stack<Character> stack = new Stack<>();
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ')') {
                if (stack.isEmpty()) {
                    continue;
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();
                        count = count + 2;
                        if (stack.isEmpty()) {
                            if (maxCount < count) {
                                maxCount = count;


                            }
                            // count=0;
                        } else {
                            if (maxCount < count) {
                                maxCount = count;
                                count = 0;

                            }
                        }
                    }
                }
            } else {
                stack.push(ch[i]);
            }
        }
        return maxCount;
    }*/

        /*char[] ch = s.toCharArray();


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
                        if(!stack.isEmpty()){
                            if (ch[i] == ')' && ch[i + 1] == '(') {
                                continue;
                            }
                            else{
                                count=0;
                            }
                        }

                        count = count+2;
                        if(stack.isEmpty()){
                            if(maxCount<count){
                                maxCount=count;


                            }
//                            count=0;
                        }
                        else{
                            if(maxCount<count){
                                maxCount=count;

//                                count=0;
                            }
                        }
                    }
                }
            } else {
                stack.push(ch[i]);
//                if(maxCount<count){
//                    maxCount=count;
//
//                }
            }
            if(i+1<ch.length) {
                if (ch[i] == ')' && ch[i + 1] == '(') {
//                    count = 0;
                }
            }

        }
        return maxCount;

    }*/

    public static void main(String[] args) {
//        String s = ")()())";
//        String s = "(()";
        String s = "()(()";
//        String s = "";
//        String s = "()(())(((())))";
//        String s = ")()())";
//        String s = "(()";
//        String s = ")";


        System.out.println(longestValidParentheses(s));

    }

}
