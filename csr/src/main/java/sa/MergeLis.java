package sa;

public class MergeLis {
    public NodeY mergeList(NodeY h1, NodeY h2){

        if(h1==null){
           return h2;
        }
        if(h2==null){
           return h1;
        }

        NodeY temp1 = h1;
        NodeY temp2=h2;

        NodeY next1=h1.next;
        NodeY next2=h2.next;


        while(temp1.data<temp2.data)

        {}
        return h1;
    }

}

class NodeY {
     int data;
     NodeY next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeY getNext() {
        return next;
    }

    public void setNext(NodeY next) {
        this.next = next;
    }

    public NodeY(int data) {
        this.data = data;
    }
}
