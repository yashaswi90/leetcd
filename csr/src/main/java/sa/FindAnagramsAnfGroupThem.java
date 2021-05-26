package sa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAnagramsAnfGroupThem {
    public static void main(String[] args) {
        String[] input = new String[]{"flop", "foo", "cat", "olfp", "act", "tac"};

        HashMap<String, List<String>> hashmap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            char[] ch = word.toCharArray();

            Arrays.sort(ch);
            String newWord = new String(ch);

            if (!hashmap.containsKey(newWord)) {
                ArrayList<String> words = new ArrayList<>();
                words.add(word);
                hashmap.put(newWord, words);
            } else {
                hashmap.get(newWord).add(word);
            }


        }

        for (String s : hashmap.keySet()) {
            List<String> list = hashmap.get(s);
            System.out.println(list);
        }
    }
}
