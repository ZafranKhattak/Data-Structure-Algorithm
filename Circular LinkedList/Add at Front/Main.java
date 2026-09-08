class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    // ADD AT FRONT
    void addFront(int data) {

        Node firstNode = new Node(data);

        if (head == null) {
            head = firstNode;
            firstNode.next = head;
        } else {
            Node current = head;

            // last node find karo
            while (current.next != head) {
                current = current.next;
            }

            firstNode.next = head;
            current.next = firstNode;
            head = firstNode;
        }
    }

    // ADD AT BACK
    void addBack(int data) {
        Node addBack = new Node(data);
        if (head == null) {
            head = addBack;
            addBack.next = head;
            return;
        }

        else {
            Node current = head;

            while (current.next != head) {
                current = current.next;
            }

            current.next = addBack;
            addBack.next = head;
        }
    }

    // DELETE FRONT
    void deleteFront() {
        if (head == null) {
            System.out.print("List is Empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        head = head.next;

        Node current = head;

        while (current.next != head) {
            current = current.next;
        }

        current.next = head;
    }

    // DELETE BACK METHO
    void deleteBack()
    {
        if(head == null)
        {
            System.out.print("List is Empty");
            return ;
        }

        if (head.next == head)
        {
            head = null;
            return ;
        }

        Node current = head;

        while(current.next.next!= head)
        {
            current = current.next;
        }

        current.next.next = head;
    }
    // DISPLAY METHOD
    void display() {
        if (head == null) {
            System.out.print("List is Empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
    }
}

public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();
        list.addFront(10);
        list.addFront(20);

        list.deleteFront();
        list.deleteBack();
        list.display();
    }
}
