class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    void insertAtBeginning(int data) {
        Node addNode = new Node(data);
        if (head == null) {
            head = addNode;
            return;
        }

        addNode.next = head;
        head = addNode;
    }

    void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.display();
    }
}
