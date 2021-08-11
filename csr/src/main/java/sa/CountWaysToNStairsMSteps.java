package sa;

public class CountWaysToNStairsMSteps {
    public static void main(String[] args) {
        System.out.println(countWays(3,2));

    }

    public static int countWays(int n,int m){
        int count =0;
        if(n<0){
            System.out.println("Stairs height is negative");
            return 0;
        }
        if(n==1||n==0){
            System.out.println("Stairs height is one");
            return 1;
        }
        if(n==2){
            System.out.println("Stairs height is two");
            return 2;
        }
       for(int i=1;i<=m;i++){
           System.out.println("Inside Recursion ...."+ (n-i) );
           count +=countWays(n-i,m);
       }
       return count;
    }
}
