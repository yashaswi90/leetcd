package sa;

public class Ceren29 {
    public static void main(String[] args) {
        int []arr= {1,2,3,4};
        call_array(arr[0],arr);
        System.out.println(arr[0]+ ","+ arr[1]);
    }

    private static void call_array(int i, int[] arr) {
        arr[i]=6;
        i=5;
    }
}
