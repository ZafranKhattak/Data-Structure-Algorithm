class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// ====================== BINARY TREE ======================
class BinarySearchTree {

    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Inorder Traversal
    void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

// ===================== MAIN CLASS ======================
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        Node root = null;

        root = tree.insert(root, 50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);
        root = tree.insert(root, 20);
        root = tree.insert(root, 40);
        root = tree.insert(root, 60);
        root = tree.insert(root, 80);

        System.out.println("Inorder Traversal:");

        tree.inorder(root);
    }
}
