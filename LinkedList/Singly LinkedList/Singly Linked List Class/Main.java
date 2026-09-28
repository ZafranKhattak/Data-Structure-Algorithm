interface List {

    public boolean isEmpty();

    public int size();

    public void add(Node n);

    public void add(int data, Node n);

    public void remove(int data);

    public void remove(Node n);

}

// ================= CLASS NODE =====================

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// ================== LINKEDLIST CLASS ===============
class LinkedList implements List {
    Node head;
    int size;

    LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // ============== ADD NODE METHOD ==================
    public void add(int data, Node n) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                n.next = current.next;
                current.next = n;
                size++;
                return;
            }

            current = current.next;
        }
    }

    // ============= ADD NODE ====================
    public void add(Node n) {
        if (head == null) {
            head = n;
            size++;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = n;
        size++;
    }

    // ============= REMOVE METHOD ===================
    public void remove(int data) {

        if (isEmpty()) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;
                return;
            }

            current = current.next;
        }
        System.out.println("Value not Found");
    }

    // ============== REMOVE NODE ===================
    public void remove(Node n) {

        if (isEmpty()) {
            return;
        }

        if (head.data == n.data) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == n.data) {
                current.next = current.next.next;
                size--;
                return;
            }

            current = current.next;
        }
    }

    // ============== TO STRING METHOD ==============
    public String toString() {

        String result = "[ size: " + size + " - ";
        Node current = head;

        while (current != null) {
            result = result + current.data;

            if (current.next != null) {
                result = result + ", ";
            }

            current = current.next;
        }

        result = result + " ]";

        return result;
    }

    // ============== SIZE METHOD ===================
    public int size() {
        return size;
    }

    // ============== ISEMTPY METHOD ===================
    public boolean isEmpty() {
        return size == 0;
    }
}

    // ============== MAIN CLASS ======================
public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Nodes create karo
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        // End mein nodes add karo
        list.add(n1);
        list.add(n2);
        list.add(n3);

        System.out.println(list);
        
        // Given data ke baad node add karo
        list.add(20, n4);

        System.out.println(list);

        // Data se remove
        list.remove(30);

        System.out.println(list);

        // Node se remove
        Node n5 = new Node(40);
        list.remove(n5);

        System.out.println(list);

        // Size
        System.out.println("Size: " + list.size());

        // Empty check
        System.out.println("Empty: " + list.isEmpty());
    }
}
