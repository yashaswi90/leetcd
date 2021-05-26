package sa;

public class MultiplyStringLeetCode {

    public static String multiply(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        return String.valueOf(n1*n2);

    }

    public static void main(String[] args) {
        String num1 = "123", num2 = "456";
        System.out.println(multiply(num1,num2));
    }

}
