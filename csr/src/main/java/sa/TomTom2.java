package sa;

import java.util.HashMap;
import java.util.Map;

public class TomTom2 {

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int count = 0;


        HashMap<Integer,Integer> map
                = new HashMap<>();

        for(int i =0;i<A.length;i++){
            if(!map.containsKey(A[i])){
                map.put(A[i],1);
            }else{
                map.put(A[i],map.get(A[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int value = entry.getValue();
            count += (value < 2 ? value : 2);
        }
        return count ;

    }

    public static void main(String[] args) {
//        int A[]=new int[]{2, 3, 3, 2, 2, 2, 1};
        int A[]=new int[]{2, 5, 3, 2, 4, 1};
        System.out.println(solution(A));
    }
}
