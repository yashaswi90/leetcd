package sa;

public class FindReverseInteger {
    public static int reverse(int x) {

        int sum = 0;
        int resultReverse;
        long sumLong=0;
        while (x != 0) {
            int rem = x % 10;
            sum = sum * 10 + rem;
            sumLong = sumLong*10+rem;
            x = x / 10;
        }
        if(sumLong!=sum){
            return 0;
        }else{

            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
