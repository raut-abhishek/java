// A simple binary search tree implementation


class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BST1 {

    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

   
    static boolean search(Node root, int key) {      // Search in BST
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }

    
    static void inorder(Node root) {               // Inorder traversal gives sorted output
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values)
            root = insert(root, v);

        System.out.println("Inorder (sorted):");
        inorder(root);                                  // Prints sorted values 

        System.out.println("\nSearch 40: " + search(root, 40));
        System.out.println("Search 100: " + search(root, 100));
    }
    
}
