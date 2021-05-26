package sa;

public class DivivdeTwoInteger {
    public static int divide(int dividend, int divisor) {
        int sum = 0;
        int count = 0;
        boolean dividendflag = false;
        boolean divisorflag = false;

        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if (dividend == Integer.MAX_VALUE && divisor == 1) {
            return Integer.MAX_VALUE;
        }
        if (dividend >= 0 && dividend < divisor) {
            return 0;
        }
        if (dividend == divisor) {
            return 1;
        }
        if (divisor < 0 && dividend < 0) {
            dividendflag = false;
            divisorflag = false;
        }
        if (divisor > 0) {
            divisorflag = true;
            divisor = (-1) * divisor;
        }
        if (dividend > 0) {
            dividendflag = true;
            dividend = (-1) * (dividend);
        }



        while (dividend <= divisor) {

            dividend = dividend - divisor;
            count++;
        }
        if (dividendflag && divisorflag) {
            return count;
        }
        if(dividendflag==false && divisorflag==false){
            return count;
        }
        return (-1) * count;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648
                ,-1));
    }

}
