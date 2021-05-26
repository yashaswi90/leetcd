package sa;

import java.util.HashMap;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        HashMap<String, Integer> map = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[0].toCharArray();

            if (!map.containsKey(ch[i])) {
                map.put(ch[i] + "", 1);
            } else {
                map.put(ch[i] + "", map.get(ch[i]) + 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        longestCommonPrefix(strs);
    }
}
