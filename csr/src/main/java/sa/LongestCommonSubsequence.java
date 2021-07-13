package sa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonSubsequence {
    static final int MAX = Integer.MAX_VALUE - 2000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip = br.readLine();
        String s1 = ip.split(" ")[0];
        String s2 = ip.split(" ")[1];

        char x[] = s1.toCharArray();
        char y[] = s2.toCharArray();

        System.out.println(findLCS(x, y));
    }

    public static int min(int... a) {
        int min = Integer.MAX_VALUE;
        for (int i : a) {
            if (min > i)
                min = i;
        }
        return min;
    }

    public static int max(int... a) {
        int max = Integer.MIN_VALUE;
        for (int i : a) {
            if (max < i)
                max = i;
        }
        return max;
    }


    public static int findLCS(char x[], char y[]) {

        int lcs[][] = new int[x.length + 1][y.length + 1];

        for (int i = 1; i <= x.length; i++) {
            for (int j = 1; j <= y.length; j++) {

                if (x[i - 1] == y[j - 1]) {
                    lcs[i][j] = 1 + lcs[i - 1][j - 1];
                } else {
                    lcs[i][j] = max(lcs[i][j - 1], lcs[i - 1][j]);
                }
            }
        }
        return lcs[x.length][y.length];


    }
}
