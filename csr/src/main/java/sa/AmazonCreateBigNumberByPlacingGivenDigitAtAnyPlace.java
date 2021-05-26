package sa;

public class AmazonCreateBigNumberByPlacingGivenDigitAtAnyPlace {
    public static void main(String[] args) {
//        int N = 268;
        int N = -999;
        int d=5;


String s="";

if(N==0){
    s=s+d+N;
}

if(N<0){
    N=N*(-1);
    while(N>0){
        int remainder = N%10;


        if(remainder>d){
            s=remainder+s;

        }else{
            int newNum = d*10+remainder;
            s=newNum+s;
        }
        N= N/10;
    }
    Integer val = Integer.valueOf(s);
    System.out.println((-1)*val);
}
        while(N>0){
            int remainder = N%10;


            if(remainder>d){
                s=remainder+s;

            }else{
                int newNum = d*10+remainder;
                s=newNum+s;
            }
            N= N/10;
        }
        System.out.println(s);
    }
}
