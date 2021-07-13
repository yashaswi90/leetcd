package sa;

public class RemoveDuplicatesFromList {
    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }


    static void print(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }


    static Node removeDuplicate(Node head) {
        Node temp = head;
        if(temp==null){
            return head;
        }else{
            while(temp.next!=null){
                if(temp.data==temp.next.data){
                    temp.next=temp.next.next;
                }else{
                    temp=temp.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(20);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);
        n1.next = n3;
        n3.next = n2;
        n2.next = n4;
        n4.next = n5;
        n5.next = n6;
        print(removeDuplicate(n1));

    }
}
