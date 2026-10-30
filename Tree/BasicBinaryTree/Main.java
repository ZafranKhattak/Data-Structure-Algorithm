class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// ====================== BINARY TREE ======================
class BasicBinaryTree {
    public static void inorder(Node root) {
        if(root == null) return ;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

// ===================== MAIN CLASS ======================
public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);

        BasicBinaryTree.inorder(root);
    }
}
