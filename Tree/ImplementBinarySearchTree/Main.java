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

    // ==================== INORDER USING INORDER METHOD ============
    void inorder() {
        inorderTraverseRecursive(root);
    }

    // ==================== inorderTraverseRecursive ================
    void inorderTraverseRecursive(Node node) {
        if (node == null) {
            return ;
        }
        inorderTraverseRecursive(node.left);
        System.out.print(node.data + " ");
        inorderTraverseRecursive(node.right);
    }

    // ==================== PREORDER METHOD ====================
    
    void preorder() 
    {
        preorderTraverseRecursive(root);
    }

    void preorderTraverseRecursive(Node node)
    {
        if(node == null)
        {
            return ;
        }

        System.out.print(node.data + " ");
        preorderTraverseRecursive(node.left);
        preorderTraverseRecursive(node.right);
    }

    // ==================== postorder ================
    void postorder()
    {
        postorderTraverseRecursive(root);
    }

    void postorderTraverseRecursive(Node node)
    {
        if(node == null)
        {
            return ;
        }
        postorderTraverseRecursive(node.left);
        postorderTraverseRecursive(node.right);
        postorderTraverseRecursive(node.data + " ");
    }
}

public class Main {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(30);
        tree.insert(25);
        tree.insert(35);
        tree.insert(40);
        tree.insert(34);
        tree.insert(24);
        tree.insert(26);

        // tree.inorder();
        // tree.preorder();
        tree.postorder();
    }
}
