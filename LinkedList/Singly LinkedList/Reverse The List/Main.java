class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// ===================== REVERSE LIST CALSS ====================
class ReverseList {
    Node head;
    Node tail;

    public ReverseList() {
        this.head = null;
        this.tail = null;
    }

    // ======================== ADD AT FRONT ===========================//

    void addFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // ====================== DISLPLAY REVERSE METHOD =======================
    void reverseMetho() {
        Node current = tail;

        while (current != head) {
            System.out.println(current.data + " ");

            Node temp = head;
            while (temp.next != current) {
                temp = temp.next;
            }

            current = temp;
        }

        System.out.print(head.data + " ");
    }
}

// ===================== MAIN CLASS ============================
class Main {
    public static void main(String[] args) {

        ReverseList list = new ReverseList();
        list.addFront(10);
        list.addFront(20);
        list.addFront(30);
        list.addFront(40);

        list.reverseMetho();
    }
}