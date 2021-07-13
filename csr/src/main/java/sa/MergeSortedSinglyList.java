package sa;

public class MergeSortedSinglyList {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        printList(node1);
        Node node4 = new Node(2);
        Node node5 = new Node(4);
        Node node6 = new Node(6);
        Node node7= new Node(8);
        node4.next = node5;
        node5.next=node7;
        printList(node4);

        printList(mergeList(node1, node4));


    }

    public static Node mergeList(Node node1, Node node2) {
        Node temp1 = node1;
        Node temp2 = node2;

        Node next1 = node1.next;
        Node next2 = node2.next;

        while (temp1 != null && temp2 != null) {
            if ((temp1.data < temp2.data) && (next1.data > temp2.data)) {
                next2 = temp2.next;
                temp1.next = temp2;
                temp2.next = next1;

                temp1 = temp2;
                temp2 = next2;

            }else{
                if (next1.next != null) {
                    next1 = next1.next;
                    temp1 = temp1.next;
                }

                // else point the last node of first list
                // to the remaining nodes of second list
                else {
                    next1.next = temp2;
                    return node1;
                }


            }
        }
        return node1;

    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static class Node {
        private int data;
        private Node next;

        public Node() {

        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(Node next) {
            this.next = next;
        }
    }
}
