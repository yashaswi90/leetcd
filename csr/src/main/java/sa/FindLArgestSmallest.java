package sa;

public class FindLArgestSmallest {
    public static void main(String[] args) {
        int []arr = new int[]{Integer.MIN_VALUE,-20, 34, 21, -87, 92,Integer.MAX_VALUE};
        int max=0;
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                int temp=max;
                max=arr[i];
            }if(arr[i]<max&&arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
