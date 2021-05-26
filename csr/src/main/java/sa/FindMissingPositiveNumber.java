package sa;

import java.util.Arrays;

public class FindMissingPositiveNumber {
    public static void main(String[] args) {
//        int a[] = new int[]{1, 3, 6, 4, 1, 2};
//        int a[]=new int[]{1,2,3};
//        int a[]= new int[]{-1, -3};;
        int a[]=new int[]{0,1,2};


        Arrays.sort(a);

        for (int i = 1; i <= a.length; i++) {
            if (a[i-1] != i) {
                System.out.println("Positive number is :" + i);
                break;

            }else if(a.length==i){
                System.out.println(i+1);
            }
        }

    }
}
