package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BasicFunctions {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void printInOrder(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            System.out.println(root.data);
        }

        printInOrder(root.left);

        printInOrder(root.right);

    }
//    public static void find(Node root,int val){
//        if(root == null){
//            return;
//        }
//
//        find(root.left,val);
//        find(root.right,val);
//
//    }
    public static void levelOrder(Node root){
        Queue<Node> sc = new LinkedList<>();
        Stack<Node> sc1 = new Stack<>();
        sc.add(root);
        while(!sc.isEmpty()){
            Node curr = sc.poll();
            sc1.push(curr);
//            System.out.println(curr.data);
            if(curr.left != null){
                sc.add(curr.left);
            }
            if(curr.right != null){
                sc.add(curr.right);
            }
        }
        while(!sc1.isEmpty()){
            System.out.println(sc1.pop().data);

        }

    }
    public static int  height(Node root){

        if(root == null){
            return 0;
        }
        int leftRoot = height(root.left);
        int rightRoot = height(root.right);

        return 1 + Math.min(rightRoot,leftRoot);

    }
    static int selfDiameter = 0;
    public static int  Diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftRoot = Diameter(root.left);
        int rightRoot = Diameter(root.right);
        selfDiameter = Math.max(selfDiameter,leftRoot+rightRoot);
        return 1 + Math.max(leftRoot,rightRoot);
    }
    public static Boolean compare(Node root1,Node root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        return(root1.data == root2.data && compare(root1.left,root2.left) && compare(root1.right,root2.right) );
    }
    public static int count(Node root){
        if(root == null) return 0;
        return 1+ count(root.left) + count(root.right);
    }
    public static boolean balanceTree(Node root){
        return balance(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    public static boolean balance(Node root , int min, int max){
        if(root == null) return true;
        if (root.data <= min || root.data >= max)
            return false;
        return(balance(root.left,min,root.data) && balance(root.right,root.data,max) );
    }



    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(13);
        root.right = new Node(14);
        root.left.left = new Node(15);
        root.left.right = new Node(16);
        root.right.left = new Node(17);
        root.left.left.right = new Node(18);
        root.right.left.left = new Node(19);
//        System.out.println(count(root));
        System.out.println(balanceTree(root));


    }
}
