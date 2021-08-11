package sa;

import java.util.Arrays;

public class CustomArrayList<E> {

    private static final int INITIALI_CAPACITY = 10;
    private int size;
    private int index;
    private Object data[];

    public CustomArrayList(Object data) {
        this.data = new Object[INITIALI_CAPACITY];
        this.size=INITIALI_CAPACITY;

    }

    public void add(E e ){
        if(this.index>this.size-1){
            increaseListSize();
        }
        this.data[this.index++]=e;
    }

    private void increaseListSize() {
        this.size=this.size+INITIALI_CAPACITY;

        Object []data = new Object[this.size];
        data = Arrays.copyOf(data,size);
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<Integer>(new int[]{10,20,40,50});


    }
}
