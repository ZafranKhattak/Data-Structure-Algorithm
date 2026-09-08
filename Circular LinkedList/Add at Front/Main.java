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
    void deleteBack() {
        if (head == null) {
            System.out.print("List is Empty");
            return;
        }

        if (head.next == head) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next.next != head) {
            current = current.next;
        }

        current.next.next = head;
    }

    // SEARCH NODE
    void searchNode(int target) {
        Node current = head;
        while (current.next != null) {
            if (current.data == target) {
                System.out.print("Target " + target + " Found");
                return;
            }
        }
        System.out.print("Target Not Found");
    }

    // DELETE SPECIFIC NODE
    void deleteNode(int data) {
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

        while (current.next.next != head) {

            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }

    }

    // UPDATE NODE
    void updateNode(int oldValue, int newValue) {
        Node current = head;

        while (current.next != head) {
            if (current.data == oldValue) {
                current.data = newValue;
            }
            current = current.next;
        }
    }

    // Add After
    void addAfter(int targetData, int data) {
        Node addAfter = new Node(data);
        if (head.next == head) {
            head.next = addAfter;
            addAfter.next = head;
        }
        Node current = head;

        while (current.next != head) {
                if(current.data == targetData)
                {
                    addAfter.next =current.next;
                    current.next = addAfter;
                    return;
                }
                current = current.next;
        }
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

        list.addBack(30);
        list.addBack(40);

        list.deleteFront();
        list.deleteBack();

        list.searchNode(20);

        list.display();
    }
}
