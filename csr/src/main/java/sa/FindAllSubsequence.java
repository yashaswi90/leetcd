package sa;

import java.math.BigInteger;

public class FindAllSubsequence {
    static char[] chars;

    public static void main(String[] args) {
        String s = "abcc";
        chars = s.toCharArray();
        printSusbequence(chars.length);

    }

    static void printSusbequence(int n) {
        int pow = (int) Math.pow(2, n);
        for (int count = 1; count < pow; count++) {
            for (int j = 0; j < n; j++) {
                if (BigInteger.valueOf(count).testBit(j)) {
                    System.out.print(chars[j] + " ");
                }
                System.out.println();
            }
        }
    }

}
