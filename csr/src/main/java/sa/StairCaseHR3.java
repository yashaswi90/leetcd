package sa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StairCaseHR3 {
    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here

        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<n-i-1;++j){
                System.out.print(" ");
            }
            for(int k=j;k<n;++k){
                System.out.print("#");
            }
            System.out.println();
        }

    }

}

class SolutionHR3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        StairCaseHR3.staircase(n);

        bufferedReader.close();
    }
}
