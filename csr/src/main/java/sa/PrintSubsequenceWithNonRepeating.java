package sa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class PrintSubsequenceWithNonRepeating {

    public static void FindSub(List<String> sub,
                               HashSet<Character> ch,
                               String str, String res,
                               int i, HashMap<String, Integer> map) {

        // Base case
        if (i == str.length()) {

            if (!map.containsKey(res)) {
                map.put(res, 1);
            } else {
                map.put(res, map.get(res) + 1);
            }
            // Insert current subsequence
            sub.add(res);
            return;
        }

        // If str[i] is not present
        // in the current subsequence
        if (!ch.contains(str.charAt(i))) {

            // Insert str[i] into the set
            ch.add(str.charAt(i));

            // Insert str[i] into the
            // current subsequence
            FindSub(sub, ch, str, res + str.charAt(i),
                    i + 1, map);

            // Remove str[i] from the set
            ch.remove(str.charAt(i));
        }
        // Not including str[i] from
        // the current subsequence
        FindSub(sub, ch, str, res, i + 1, map);
    }

    static String longestRepeatedSubstring(String str) {
        int n = str.length();
        int LCSRe[][] = new int[n + 1][n + 1];

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

        // If we have non-empty result, then insert all
        // characters from first character to last
        // character of String
        if (res_length > 0) {
            for (i = index - res_length + 1; i <= index; i++) {
                res += str.charAt(i - 1);
            }
        }

        return res;
    }
    private static String getStringAfterRemovingoverlappingString(String str) {
        String string=null;
        for(int i=0;i< str.length() && i+1 <str.length();i++){
            if(str.charAt(i) == str.charAt(i+1)){
                string = str.subSequence(i+1,str.length()).toString();
            }
            else{
                string=string+str.charAt(i);
            }
        }
        return string;
    }

    public static String q1(HashMap<String, Integer> name, int maxValueInMap) {

        String longest = "";

        for (Map.Entry<String, Integer> key : name.entrySet()) {
            if (key.getKey().length() > longest.length() && key.getValue() == maxValueInMap) {
                longest = key.getKey();
            }

        }
        int sized = longest.length();
        return longest;
    }

    // Utility function to print all subsequences
    // of string with non-repeating characters
    public static int printSubwithUniqueChar(String str,
                                             int N) {

        int maxLength = 0;
        // Stores all possible subsequences
        // with non-repeating characters
        List<String> sub = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        // Stores subsequence with
        // non-repeating characters
        HashSet<Character> ch = new HashSet<>();

        FindSub(sub, ch, str, "", 0, map);

        // Traverse all possible subsequences
        // containing non-repeating characters

        int maxValueInMap = (Collections.max(map.values()));  // This will return max value in the Hashmap
        String longestSubsequence = q1(map, maxValueInMap);

       /* for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // Itrate through hashmap

            if ((entry.getKey().equals(longestSubsequence)) && (entry.getValue() == maxValueInMap)) {
               return maxValueInMap;     // Print the key with max value
            }
        }*/

        return maxValueInMap;
//        Map.Entry<String, Integer> mapValue = getMaxEntryInMapBasedOnValue(map);
//        System.out.println(mapValue);
       /* for (String subString : sub) {
            int length = subString.length();

            // Print subsequence
            System.out.print(subString + " ");
        }*/
    }

    public static <K, V extends Comparable<V>> Map.Entry<K, V>
    getMaxEntryInMapBasedOnValue(Map<K, V> map) {
        // To store the result
        Map.Entry<K, V> entryWithMaxValue = null;

        // Iterate in the map to find the required entry
        for (Map.Entry<K, V> currentEntry : map.entrySet()) {

            if (
                // If this is the first entry, set result as this
                    entryWithMaxValue == null

                            // If this entry's value is more than the max value
                            // Set this entry as the max
                            || currentEntry.getValue()
                            .compareTo(entryWithMaxValue.getValue())
                            > 0) {

                entryWithMaxValue = currentEntry;
            }
        }

        // Return the entry with highest value
        return entryWithMaxValue;
    }

    // Driver Code
    public static void main(String args[]) {

        String str = "abcc";
        System.out.println(longestRepeatedSubstring(str));
        getStringAfterRemovingoverlappingString(str);
        int N = str.length();

        System.out.println(printSubwithUniqueChar(str, N));
    }
}
