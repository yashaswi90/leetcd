package sa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HackerEarth1 {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        name = name.replaceAll("\\\\", "");
        name = name.replaceAll("\\/", "");
        for (int i = name.length() - 1; i > 0; i--) {
            System.out.print(name.charAt(i));
        }

    }
}
