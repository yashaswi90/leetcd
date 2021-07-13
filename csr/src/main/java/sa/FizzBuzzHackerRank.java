package sa;

public class FizzBuzzHackerRank {
    public static void main(String[] args) {
        fizzBuzz(15);
    }

    public static void fizzBuzz(int n) {
        int count3 = 0;
        int count5 = 0;

        for (int i = 1; i <= n; ++i) {
            count3++;
            count5++;
            boolean flag = false;
            if (count3 == 3) {
                System.out.println("Fizz");

                count3 = 0;
                flag = true;
            }
            if (count5 == 5) {
                System.out.println("Buzz");
                count5 = 0;
                flag = true;
            }


            if (!flag) {
                System.out.println(i);
            }
        }

    }
}
