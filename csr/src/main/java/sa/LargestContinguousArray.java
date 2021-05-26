package sa;

public class LargestContinguousArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_sum = 0;
        int max=0;

        for(int i=0;i<arr.length;i++){
            max_sum=arr[i]+max_sum;
            if(max_sum<0){
                max_sum=0;
            }
            else if(max_sum>max){
               max=max_sum;
            }
        }
        System.out.println(max);
    }

}
