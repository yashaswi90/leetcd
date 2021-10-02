package sa;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {

    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        Queue<Node> queue = new ArrayDeque<>();

        queue.add(root);


        Node curr;

        while(!queue.isEmpty()){
            curr = queue.poll();
            if(curr==null){
                if(!queue.isEmpty()){
                    System.out.println(curr.data);
                }
            }else{
                System.out.print(curr.data + " ");
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
            }


        }
    }
}
