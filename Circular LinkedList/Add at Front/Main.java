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

    void addFront(int data) {

    Node firstNode = new Node(data);

    if (head == null) {
        head = firstNode;
        firstNode.next = head;
    }
    else {
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

    // DISPLAY METHOD

    void display()
    {
        if(head == null)
        {
            System.out.print("List is Empty");
            return ;
        }

        Node current = head;       
        do 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        while(current != head);
    }
}

public class Main {
    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();
        list.addFront(10);
        list.addFront(10);

        list.display();
    }
}
