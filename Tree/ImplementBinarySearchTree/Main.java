package Tree.ImplementBinarySearchTree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    Node root;
    int size;

    BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    // ==================== INSERT METHOD =====================
    void insert(int value) {
        root = insertRecursive(root, value);
        size++;
    }

    // ==================== INSERTRECURSIVE METHOD =============
    Node insertRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.data) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.data) {
            node.right = insertRecursive(node.right, value);
        }

        return node;
    }

    // ==================== SEARCH METHOD ======================
    boolean search(int value) {
        return recursiveSearch(root, value);
    }

    // ==================== RECURSIVE SEARCH METHOD ============
    boolean recursiveSearch(Node node, int value) {
        if (node == null) {
            throw new RuntimeException("Tree is Empty");
        }
        if (value == node.data) {
            return true;
        } else if (value < node.data) {
            return recursiveSearch(node.left, value);
        } else {
            return recursiveSearch(node.right, value);
        }
    }

    // ==================== DISPLAY USING INORDER METHOD ============
    void display()
    {
        inorder(root);
    }
    void inorder(Node node)
    {
        if(node == null)
        {
            throw new RuntimeException("Tree is Empty!");
        }
        inorder(node.left);
        System.out.print(node.data);
        inorder(node.right);
    }

}

public class Main {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);

        tree.display();
    }
}
