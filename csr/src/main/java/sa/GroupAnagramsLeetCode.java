package sa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagramsLeetCode {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map =new HashMap<>();
        Arrays.stream(strs).forEach(s->{
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String newWord = new String(ch);
            if(!map.containsKey(newWord)){
                List<String> slist = new ArrayList();
                slist.add(s);
                map.put(newWord,slist);
            }else{
               map.get(newWord).add(s);
            }

        });

        List<List<String>> out = new ArrayList<>();
        map.entrySet().stream().forEach(s->{
            out.add(s.getValue());
        });
        return out;
    }


    public static void main(String[] args) {
        String str[] ={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
}
