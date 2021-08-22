package sa;

public class Zemosolabs {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 6, 5, 9, 7};
        System.out.println(findSlie(arr));
        System.out.println(findSlie(new int[]{4, 3, 2, 6, 1}));
        System.out.println(findSlie(new int[]{2, 1, 6, 4, 3, 7}));

    }

    public static int findSlie(int[] arr) {
        int count = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; ) {
            int min = arr[i];

            for (int j = i; j < arr.length; j++) {

                if (j + 1 < arr.length) {
                    if (arr[j] < arr[j + 1] && arr[j] <= min) {
                        min = arr[j];
                        minIndex = j;

                    } else {
                        if (min > arr[j + 1]) {
                            min = arr[j + 1];
                            minIndex = j + 1;

                        }
                    }
                } else if (i == arr.length - 1) {
                    count++;
                    return count;
                }


            }

            count++;
            i = minIndex + 1;
        }
        return count;
    }
}
