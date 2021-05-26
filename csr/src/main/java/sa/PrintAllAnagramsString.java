package sa;

import static java.util.Arrays.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAllAnagramsString {
    public static void main(String[] args) {
        String[] input = new String[]{"flop", "foo", "cat", "olfp", "act", "tac"};
        HashMap<String, List<String>> map = new HashMap<>();

        stream(input).forEach(word -> {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars);
            if (!map.containsKey(newWord)) {
                ArrayList<String> wordList = new ArrayList<>();
                wordList.add(word);
                map.put(newWord, wordList);
            } else {
               map.get(newWord).add(word);
            }
        });
        map.entrySet().stream().filter(s-> s.getValue().size()>1).forEach(System.out::println);
    }


}
