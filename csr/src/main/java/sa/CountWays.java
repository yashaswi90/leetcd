package sa;

public class CountWays {

    private static int finalCount = 0;

    public static int countSteps(int N, int m) {
          int  count = 0;
          if(N==0){
              return 0;
          }
        if (N == 1) {
            return 1;
        }
        if (N == 2) {
            return 2;
        }

        // for all N > 2, we add the previous (N - 1) + (N - 2) steps to get
        // an answer recursively

        for (int i = 1; i <= m; i++) {
            count = count + countSteps(N - i, m);


        }


       return count;
    }

    public static void main(String[] args) {
        int n = 4, m = 1;

        System.out.printf("Total ways to reach the %d'th stair with at most " +
                "%d steps are %d", n, m, countSteps(n,m));
    }
}
