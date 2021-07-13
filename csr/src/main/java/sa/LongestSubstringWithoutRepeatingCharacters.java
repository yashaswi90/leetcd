package sa;
//Given a string s, find the length of the longest substring without repeating characters.

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        int N=20;
        if(N%2==0){
            System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }

//        System.out.println(LongestSubstringWithoutRepeatingCharacters.findLongestSubstring("abcabcbb"));
        longestSubstring("pickoutthelongestsubstring");
        System.out.println(longSubsting("pwwkew"));
    }

    static void longestSubstring(String inputString) {

        char[] arr1 = inputString.toCharArray();
        String long_str = null;
        int str_length = 0;
        LinkedHashMap<
                Character, Integer>
                charPosMap = new LinkedHashMap<>
                ();
        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            } else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            if (charPosMap.size() > str_length) {
                str_length = charPosMap.size();
                long_str = charPosMap.keySet().toString();
            }
        }
        System.out.println("Input String : " + inputString);
        System.out.println("The longest substring : " + long_str);
        System.out.println("The longest Substring Length : " + str_length);
    }




    static int  longSubsting(String s){

        char []ch = s.toCharArray();
        int subStringLen = 0;
        String long_Sub="";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<ch.length;i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],i);
            }else{
                i = map.get(ch[i]);
                map.clear();
            }
            if(map.size()>subStringLen){
                subStringLen =map.size();
                long_Sub = map.keySet().toString();
            }
        }
        return subStringLen;

    }

    public static String findLongestSubstring(String str) {
        int i;
        int n = str.length();

        // Starting point
        // of current substring.
        int st = 0;

        // length of
        // current substring.
        int currlen = 0;

        // maximum length
        // substring without
        // repeating characters.
        int maxlen = 0;

        // starting index of
        // maximum length substring.
        int start = 0;

        // Hash Map to store last
        // occurrence of each

        // already visited character.
        HashMap<Character,
                Integer> pos = new HashMap<Character,
                Integer>();

        // Last occurrence of first
        // character is index 0;
        pos.put(str.charAt(0), 0);

        for (i = 1; i < n; i++) {
            // If this character is not present in hash,
            // then this is first occurrence of this
            // character, store this in hash.
            if (!pos.containsKey(str.charAt(i))) {
                pos.put(str.charAt(i), i);
            } else {
                // If this character is present
                // in hash then this character
                // has previous occurrence,
                // check if that occurrence
                // is before or after starting
                // point of current substring.
                if (pos.get(str.charAt(i)) >= st) {
                    // find length of current
                    // substring and update maxlen
                    // and start accordingly.
                    currlen = i - st;
                    if (maxlen < currlen) {
                        maxlen = currlen;
                        start = st;
                    }

                    // Next substring will start
                    // after the last occurrence
                    // of current character to avoid
                    // its repetition.
                    st = pos.get(str.charAt(i)) + 1;
                }

                // Update last occurrence of
                // current character.
                pos.replace(str.charAt(i), i);
            }
        }

        // Compare length of last
        // substring with maxlen and
        // update maxlen and start
        // accordingly.
        if (maxlen < i - st) {
            maxlen = i - st;
            start = st;
        }

        // The required longest
        // substring without
        // repeating characters
        // is from str[start]
        // to str[start+maxlen-1].
        return str.substring(start,
                start +
                        maxlen);
    }
}
