package sa;

import static java.util.Arrays.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Catalogic {


    //Input : ['flop','foo','cat','olfp','act','tac']
    //Output: [['foo'],['olfp','flop'],['act','cat','tac']]
    public static void main(String[] args) {
        String[] input = new String[]{"flop", "foo", "cat", "olfp", "act", "tac"};


        Arrays.sort(input);

        Arrays.stream(input).forEach(System.out::println);

       Set<Set<String>> lists = new HashSet<>();


        for (int i = 0; i < input.length; i++) {
            boolean status = true;
            Set<String> anaTempResult = new HashSet<String>();
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].length() != input[j].length()) {
                    status = false;
                } else {


                    char[] source1 = input[i].toLowerCase().toCharArray();
                    char[] source2 = input[j].toLowerCase().toCharArray();
                    sort(source1);
                    sort(source2);
                    status = Arrays.equals(source1, source2);
                    if (status == true) {

                        if (!lists.contains(input[i]) || !lists.contains(input[j])) {
                            anaTempResult.add(input[i]);
                            anaTempResult.add(input[j]);
                        }
                    }


                }
            }
            if (anaTempResult.size() > 0) {
                lists.add(anaTempResult);
            }


        }
        System.out.println(lists);

    }


}
