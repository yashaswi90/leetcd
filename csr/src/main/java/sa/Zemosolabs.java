package sa;

public class Zemosolabs {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 6, 5, 9, 7};
        System.out.println(findSlie(arr));
        System.out.println(findSlie(new int[]{4, 3, 2, 6, 1}));
        System.out.println(findSlie(new int[]{2, 1, 6, 4, 3, 7}));

    }

    public static int findSlie(int[] A) {
        int count = 0;
        int minIndex = 0;
        for (int i = 0; i < A.length; ) {
            int min = A[i];

            for (int j = i; j < A.length; j++) {

                if (j + 1 < A.length) {
                    if (A[j] < A[j + 1] && A[j] <= min) {
                        min = A[j];
                        minIndex = j;

                    } else {
                        if (min > A[j + 1]) {
                            min = A[j + 1];
                            minIndex = j + 1;

                        }
                    }
                } else if (i == A.length - 1) {
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
