package sa;

public class Google {
    public static void main(String[] args) {
        int arr[]={5,9,2};
        int N=arr.length;
        
        for(int i=0;i<N-1;i++){
            for(int j=N-1;j!=i;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(arr);
    }

    private static void swap(int i, int i1) {
        int temp=i1;
        i1=i;
        i=temp;
    }
}
