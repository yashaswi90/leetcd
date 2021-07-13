package sa;

import java.util.Arrays;

public class SortAnArrayWithSingleLoop {
    public static void main(String[] args) {

        int arr[] = {5, 4,2, 9, 6};
        int length = arr.length;
        for (int j = 0; j < length - 1; j++) {
            System.out.println("J value is " + j);
            // Checking the condition for two
            // simultaneous elements of the array
            if (arr[j] > arr[j + 1]) {

                // Swapping the elements.
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.


                System.out.println("J value before"+j);
                j = -1;
                System.out.println("J value after"+j);
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println(arr[arr.length-1]*arr[arr.length-2]);

    }
}
