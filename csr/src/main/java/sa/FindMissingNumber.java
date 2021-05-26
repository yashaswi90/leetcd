package sa;

import java.util.HashMap;

public class FindMissingNumber {
    public static void main(String[] args) {
        int a[] = new int[]{ 3, 6, 4, 1,2};
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        int count=0;
        for (int num : a) {
            if(!hashMap.containsKey(num))
            hashMap.put(num,1);
            else
                hashMap.put(num,hashMap.get(num)+1);
        }
        for(int i=1;i<=a.length;i++){
            if(!hashMap.containsKey(i)){
                System.out.println(i);
            }
        }
    }
}
