package sa;

public class CustomStack<E> {
    int[] arr = new int[10];
    int minArr[];
    int index = 0;
    int minElement = 0;

    CustomStack() {
        minArr = new int[10];
    }

    public void add(int d) {
        minArr[index] = Math.min(minArr[index], d);
        if (index > arr.length - 1) {
            return;
        }
        arr[index++] = d;
    }

    public void pop() {

    }

}
