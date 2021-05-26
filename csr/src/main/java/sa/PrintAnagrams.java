package sa;

import static java.util.Arrays.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PrintAnagrams {


    //Input : ['flop','foo','cat','olfp','act','tac']
    //Output: [['foo'],['olfp','flop'],['act','cat','tac']]
    private static ArrayList<ArrayList<String> >
    solver(
            ArrayList<String> list)
    {

        // Inner hashmap counts frequency
        // of characters in a string.
        // Outer hashmap for if same
        // frequency characters are present in
        // in a string then it will add it to
        // the arraylist.
        HashMap<HashMap<Character, Integer>,
                ArrayList<String> >
                map = new HashMap<HashMap<Character, Integer>,
                ArrayList<String> >();
        for (String str : list) {
            HashMap<Character, Integer>
                    tempMap = new HashMap<Character, Integer>();

            // Counting the frequency of the
            // characters present in a string
            for (int i = 0; i < str.length(); i++) {
                if (tempMap.containsKey(str.charAt(i))) {
                    int x = tempMap.get(str.charAt(i));
                    tempMap.put(str.charAt(i), ++x);
                }
                else {
                    tempMap.put(str.charAt(i), 1);
                }
            }

            // If the same frequency of chanracters
            // are alraedy present then add that
            // string into that arraylist otherwise
            // created a new arraylist and add that string
            if (map.containsKey(tempMap))
                map.get(tempMap).add(str);
            else {
                ArrayList<String>
                        tempList = new ArrayList<String>();
                tempList.add(str);
                map.put(tempMap, tempList);
            }
        }

        // Stores the result in a arraylist
        ArrayList<ArrayList<String> >
                result = new ArrayList<>();
        for (HashMap<Character, Integer>
                temp : map.keySet())
            result.add(map.get(temp));
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("flop");
        list.add("foo");
        list.add("cat");
        list.add("act");
        list.add("tac");
        list.add("olpf");


        System.out.println(solver(list));
    }

}
