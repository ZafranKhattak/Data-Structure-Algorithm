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

    void addLast(int data) {
        Node addLast = new Node(data);
        if (head == null) {
            head = addLast;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = addLast;
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
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.display();
    }
}
