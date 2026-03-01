package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class functionsOnTrees {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);

    }
    public static void levelOrderTraversal(Node root){
        Queue<Node> sc = new LinkedList<>();
        sc.add(root);
        while(!sc.isEmpty()){
            Node current = sc.poll();
            System.out.println(current.data);
            if(current.left != null){
                sc.add(current.left);
            }
            if(current.right !=null){
                sc.add(current.right);
            }
        }
    }


    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(12);
        root.right = new Node(70);

        root.left.left = new Node(10);
        root.left.right = new Node(20);

        root.right.left = new Node(30);
        root.right.right = new Node(50);
//        inOrder(root);
        levelOrderTraversal(root);

    }
}
