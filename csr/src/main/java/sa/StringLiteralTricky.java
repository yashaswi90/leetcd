package sa;

public class StringLiteralTricky {

    public static void main(String[] args) {

        String s1="this is good";
        String s2="this is good";
        String s3 = new String("this is good");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
    }
}
