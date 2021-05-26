package sa;

import java.util.HashSet;

public class PrintLinkedList {
    public static void main(String[] args) {
        Node startNode = null;
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n3);

        startNode = n1;
//        printStartNode(startNode);
        System.out.println(detectLoop(startNode));
    }

    public static void printStartNode(Node n) {
        if (n == null) {
            return;
        }
        printStartNode(n.getNext());
        System.out.println(n.getData() + " ");
    }

    public static boolean detectLoop(Node n) {
        Node ptr = n;
        HashSet<Node> h = new HashSet<>();
        while (ptr != null) {
            if (h.contains(ptr)) {
                return true;
            }
            h.add(ptr);
            ptr = ptr.next;
        }
        return false;

    }
}
