package Trees;

public class creation {
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
    public static void print(Node root){

        if(root == null){
            return;
        }

        print(root.left);
        print(root.right);


    }
    public static int countElement(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null ){
            return root.data;
        }
        return countElement(root.left)+ countElement(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);
//        print(root);
        System.out.println(countElement(root));;
    }
}
