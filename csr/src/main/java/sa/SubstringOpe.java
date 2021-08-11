package sa;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SubstringOpe {
    static List<String> al = new ArrayList<>();


    public static void main(String[] args) {
        String str = "abcc";
        System.out.println(lengthOfLongestSubstring(str));
        System.out.println(longestRepeatedSubstring(str));

        String s = "";
        /*for(int i=0;i< str.length();i++){

            if(str.length()<i+1){
                return;
            }

           if(str.charAt(i)!=str.charAt(i+1)){
               s=str.charAt(i)+str.charAt(i+1)+s;
           }else{
               continue;
           }
        }*/


        Deque<String> output = new ArrayDeque<>();

//        recur(str, output);

        System.out.println(output);
       /* String ans = "";
        HashMap<String, Integer> stringHashMap = new HashMap<>();
        int count = 0;
        findsubsequences(str, ans);
        System.out.println(al);
        List<String> result = new ArrayList<>();
        for (String s : al) {
            if (stringHashMap.containsKey(s)) {
                if (stringHashMap.put(s, ))
            }
        }*/


//        System.out.println(count);
    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.length()<1){
            return 0;
        }

        if(s.length()==1){
            return 1;
        }

        String subS = "";
        int subSLength = 1;
        int index = 0;
        subS +=s.charAt(0);
        char temChar ;
        subSLength = subS.length();
        boolean isInSubS = false;
        while(index<s.length()){
            if(subSLength>=s.substring(index).length()){
                break;
            }
            for(int i=index+1;i<s.length();i++){
                temChar = s.charAt(i);
                for(int j=0;j<subS.length();j++){
                    if(temChar==subS.charAt(j)){
                        if(subS.length()>subSLength){
                            subSLength = subS.length();
                        }
                        isInSubS = true;
                        if(j==subS.length()-1){
                            subS = ""+temChar;
                            index = i;
                        }
                        else{
                            subS = ""+subS.charAt(j+1);
                            index = index+j+1;
                        }
                        break;
                    }
                }
                if(!isInSubS){
                    subS += temChar;
                }
                else{
                    isInSubS = false;
                    break;
                }
            }

        }
        return subSLength;

    }

    static String longestRepeatedSubstring(String str) {
        int n = str.length();
        int LCSRe[][] = new int[n + 1][n + 1];
int count=0;
        String res = ""; // To store result
        int res_length = 0; // To store length of result

        // building table in bottom-up manner
        int i, index = 0;
        for (i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                // (j-i) > LCSRe[i-1][j-1] to remove
                // overlapping
                if (str.charAt(i - 1) == str.charAt(j - 1)
                        && LCSRe[i - 1][j - 1] < (j - i)) {
                    LCSRe[i][j] = LCSRe[i - 1][j - 1] + 1;

                    // updating maximum length of the
                    // substring and updating the finishing
                    // index of the suffix
                    if (LCSRe[i][j] > res_length) {
                        res_length = LCSRe[i][j];
                        index = Math.max(i, index);
                    }

                } else {
                    LCSRe[i][j] = 0;
                }
            }
        }
        if (res_length > 0) {
            for (i = index - res_length + 1; i <= index; i++) {
                res += str.charAt(i - 1);

                count++;
            }
        }

        System.out.println(count);
        return res;
    }

    public static void recur(String str, Deque<String> output) {
        // if all characters of the input string are processed,
        // print the output string
        if (str.length() == 0) {
            System.out.println(output);
            return;
        }

        // add each substring `str[0, i]` to the output string and recur for
        // remaining substring `str[i+1, n-1]`
        for (int i = 0; i < str.length(); i++) {
            // push substring `str[0, i]` into the output string
            output.addLast(str.substring(0, i + 1));

            // recur for the remaining string `str[i+1, n-1]`
            recur(str.substring(i + 1), output);

            // backtrack: remove current substring from the output
            output.pollLast();
        }
    }

    private static void findsubsequences(String s,
                                         String ans) {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }


        findsubsequences(s.substring(1), ans + s.charAt(0));


        findsubsequences(s.substring(1), ans);
    }

}
