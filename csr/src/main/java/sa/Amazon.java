/*
package sa;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class Amazon {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        // String[][] edgesInput=new String[r][];

        List<String> edges = IntStream.range(0, r).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        int result = Amazon.connectedSum(n, edges);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }

    public static int connectedSum(int n, List<String> edges) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        int sum = 0;
        edges.stream().forEach(s -> {
            String[] token = s.split(" ");
            Integer edge1 = Integer.valueOf(token[0]);
            Integer edge2 = Integer.valueOf(token[1]);

            if (!map.containsKey(edge1)) {
                map.put(edge1, token[1]);
            } else {
                map.put(edge1, edge1 + "," + map.get(edge1) + "," + token[1]);
            }
        });
        map.entrySet().forEach(System.out::println);


        for (Map.Entry<Integer, String> vale : map.entrySet()) {
            String[] split = vale.getValue().split(",");
            for (int i = 1, k = 0; i <= n && k < split.length; i++, k++) {
                if (Integer.valueOf(split[k]) == i) {


                } else {
                    map.put(i, "0");
                }
            }


        }

        for (Map.Entry<Integer, String> vale : map.entrySet()) {
            int sum1=0;
            int sum2=0;
            if(vale.getValue()){
                String[] split = vale.getValue().split(", ");

                sum1 = (int) (Math.ceil(Math.sqrt(split.length)));
            }else{
                sum2 = (int) (Math.ceil(Math.sqrt(1)));
            }


            sum = sum1 + sum2;
        }

       */
/* for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (Map.Entry<Integer, String> s : map.entrySet()) {
                String[] split = s.getValue().split(",");
                for (int j = 0; j < split.length; j++) {
                    if (Integer.valueOf(split[j]) == i++) {
                        flag = false;
                        continue;
                    } else {
                        flag = true;
                    }

                    if (flag == true) {
                        sum = (int) (sum + Math.ceil(Math.sqrt(1)));
                    } else {
                        int e = split.length;
                        sum = (int) (sum + Math.ceil(Math.sqrt(e)));

                    }
                }
            }

        }*//*



        return sum;
    }
}
*/
