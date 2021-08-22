package sa;

public class RemoveNthNodeFromEnd {
int length=0;
    public static void main(String[] args) {
        Node node = new Node(5);
        Node node1 = new Node(6);
        Node node2 = new Node(7);
        Node node3 = new Node(1);
        Node node4= new Node(2);

        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        RemoveNthNodeFromEnd list =new RemoveNthNodeFromEnd();
        list.printList(node);


        Node reverseList = list.reverseList(node);
        list.printList(reverseList);
        Node nthNodeFromLst= list.findElementFromNthNode(node,3);
        // Finding 3rd node from end
        Node nthNodeFromLast= list.nthFromLastNode(node,3);
        System.out.println("3th node from end is : "+ nthNodeFromLast.data);

    }
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.data);
            temp = temp.next;
            length++;
        }
        System.out.println();
    }

    public Node findElementFromNthNode(Node head,int n){
        Node temp = head;
        int diff = length-n;
        for(int i=1;i<=diff;i++){
            temp= temp.next;
        }
        return temp;
    }


    public Node reverseList(Node head) {
        if(head==null || head.next == null)
            return head;

        //get second node
        Node second = head.next;
        //set first's next to be null
        head.next = null;

        Node rest = reverseList(second);
        second.next = head;

        return rest;
    }


    public Node nthFromLastNode(Node head,int n)
    {
        Node firstPtr=head;
        Node secondPtr=head;




        for (int i = 0; i < n; i++) {
            firstPtr=firstPtr.next;

        }

        while(firstPtr!=null)
        {
            firstPtr=firstPtr.next;
            secondPtr=secondPtr.next;
        }

        return secondPtr;
    }

}
