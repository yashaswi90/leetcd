package sa;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MiniMaxHR1 {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here

            Integer []a = new Integer[5];
            arr.toArray(a);
            Arrays.sort(a);
            int minSum=0;
            int maxSum = 0;
            for(int i =0;i<4;i++){
                minSum = a[i]+minSum;
            }

            for(int i =4;i>0;i--){
                maxSum = a[i]+maxSum;
            }

            System.out.println(minSum + " "+ maxSum);
        }

    }

    class SolutionHR1 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            MiniMaxHR1.miniMaxSum(arr);

            bufferedReader.close();
        }

}
