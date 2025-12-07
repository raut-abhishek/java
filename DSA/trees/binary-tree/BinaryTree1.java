// A simple binary tree implementation

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BinaryTree1 {


    public static void main(String[] args) {
        
        Node root = new Node(1);    // Creating nodes
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder Traversal:");
        inorder(root);
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}