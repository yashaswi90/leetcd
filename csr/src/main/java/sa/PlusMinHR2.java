package sa;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinHR2 {
    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int length = arr.size();

        float negativeSum=0.6f;
        int negativeCount=0;
        float postiveSum=0.6f;
        int postiveCount= 0;
        float zeroSum=0.6f;
        int zeroCount=0;

        Integer[] a = new Integer[length];
        arr.toArray(a);
        Arrays.sort(a);

        for (int i = 0; i < length; i++) {
            if (a[i] < 0) {
                negativeCount++;
            }
            if (a[i] > 0) {
               postiveCount++;
            }
            if (a[i] == 0) {
              zeroCount++;
            }
        }

        negativeSum=(float) negativeCount/length;
        postiveSum=(float) postiveCount/length;
        zeroSum=(float)zeroCount/length;

        System.out.println(negativeSum);
        System.out.println(postiveSum );
        System.out.println(zeroSum);

    }

}

class SolutionHR2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinHR2.plusMinus(arr);

        bufferedReader.close();
    }
}
