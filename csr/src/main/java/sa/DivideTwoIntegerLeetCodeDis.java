package sa;

public class DivideTwoIntegerLeetCodeDis {
    public static int divide(int dividend, int divisor) {

        if (dividend == 0) return 0;

        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        boolean Negative = true;

        if ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0))
            Negative = false;

        if (dividend > 0) {
            dividend = 0 - dividend;
        }
        if (divisor > 0) {
            divisor = 0 - divisor;
        }

        int quotient = 0;
        while (dividend <= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }

        if (Negative && quotient > 0) return 0 - quotient;

        else return quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648
                ,-1));

    }
}
