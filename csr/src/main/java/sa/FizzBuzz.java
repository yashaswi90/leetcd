package sa;

/**
 * Given an integer N, the task is to print all the numbers from 1 to N replacing the multiples of 3, 5 and both 3 and 5 by “Fizz”, “Buzz” and “Fizz Buzz” respectively.
 * <p>
 * Examples:
 * <p>
 * Input: N = 5
 * Output: 1, 2, Fizz, 4, Buzz
 * <p>
 * Input: N = 15
 * Output: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14
 * Fizz Buzz
 */
class FizzBuzz {

    // Function to generate FizzBuzz sequence
    static void fizzBuzz(int N) {

        // Stores count of multiples
        // of 3 and 5 respectively
        int count3 = 0;
        int count5 = 0;

        // Iterate from 1 to N
        for (int i = 1; i <= N; i++) {

            // Increment count3 by 1
            count3++;

            // Increment count5 by 1
            count5++;

            // Initialize a boolean variable
            // to check if none of the
            // condition matches
            boolean flag = false;

            // Check if the value of count3
            // is equal to 3
            if (count3 == 3) {
                System.out.print("Fizz");

                // Reset count3 to 0, and
                // set flag as True
                count3 = 0;
                flag = true;
            }

            // Check if the value of count5
            // is equal  to 5
            if (count5 == 5) {
                System.out.print("Buzz");

                // Reset count5 to 0, and
                // set flag as True
                count5 = 0;
                flag = true;
            }

            // If none of the condition matches
            if (!flag) {
                System.out.print(i);
            }

            System.out.print(" ");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int N = 15;
        fizzBuzz(N);
    }
}