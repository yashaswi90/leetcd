package sa;

import java.util.HashMap;

public class CerenceCode {
    public static void main(String[] args) {
        System.out.println(closedPaths(649578));
        System.out.println(closedPaths(630));
    }

    public static int closedPaths(int number) {
        HashMap<Integer, Integer> mpa = new HashMap<>();
        mpa.put(0, 1);
        mpa.put(4, 1);
        mpa.put(6, 1);
        mpa.put(9, 1);
        mpa.put(8, 2);
        int sum = 0;
        while (number > 0) {
            Integer rem = number % 10;
            if (mpa.containsKey(rem)) {
                sum = sum + mpa.get(rem);
            } else {
                sum = sum + 0;
            }
            number = number / 10;
        }
        return sum;
    }
}
