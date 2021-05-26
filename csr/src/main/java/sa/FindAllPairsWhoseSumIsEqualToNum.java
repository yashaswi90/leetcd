package sa;

import java.util.HashSet;
import java.util.Set;

public class FindAllPairsWhoseSumIsEqualToNum {
    public static void main(String[] args) {
        int a[] = new int[]{2, 6, 3, 9, 11, 1, 18, 21, 8, 7, 5, 4};
        int k = 9;
    /*    for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                if (sum == k) {
                    System.out.println("Pairs is " + a[i] + " : " + a[j]);
                }
            }
        }*/

        /*List<Integer> listOfIntegerNumbers = Arrays.stream(a).boxed().collect(Collectors.toList());
        listOfIntegerNumbers.stream().forEach(num -> {
            int diff = k - num;
            if(diff>0) {
                listOfIntegerNumbers.contains(diff);
                System.out.println("num  pairs is " + num + ":" + diff);

            }
            else if(diff<0){
              return;
            }
        });*/


        Set set = new HashSet(a.length);
        for (int value : a) {
            int target = k - value;
            if (!set.contains(target)) {
                set.add(value);
            }else{
                    System.out.printf("(%d, %d) %n", value, target);
                }
            }

    }
}
