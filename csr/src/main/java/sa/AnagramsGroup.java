package sa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramsGroup {
    public static void main(String[] args) {
        String arr[] = new String[]{"flop", "foo", "cat", "olfp", "act", "tac"};

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String words = arr[i];
            char[] chars = words.toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars);
            if (!map.containsKey(newWord)) {
                List<String> wordList = new ArrayList<>();
                wordList.add(words);
                map.put(newWord, wordList);
            } else {
                map.get(newWord).add(words);
            }
        }


        for (String values : map.keySet()) {

            System.out.println(map.get(values));
        }

    }
}
