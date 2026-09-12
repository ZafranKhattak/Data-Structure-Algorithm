class Node {
    Node prev;
    int data;
    Node next;

    public Node(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // ADD AT FRONT
    void addFront(int data) {
        Node addAtFront = new Node(data);

        if (head == null) {
            head = addAtFront;
            tail = addAtFront;
        } else {
            addAtFront.next = head;
            head.prev = addAtFront;
            head = addAtFront;
        }
    }

    // ADD AT BACK
    void addBack(int data) {
        Node addAtBack = new Node(data);

        if (head == null) {
            head = addAtBack;
            tail = addAtBack;
        } else {
            tail.next = addAtBack;
            addAtBack.prev = tail;
            tail = addAtBack;
        }
    }

    // DELETE FROM FRONT
    void deleteFront() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // DELETE FROM BACK
    void deleteBack() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // SEARCH NODE
    void searchNode(int data) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        while (current != null) {
            if (current.data == data) {
                System.out.println("Target Found");
                return;
            }

            current = current.next;
        }

        System.out.println("Target Not Found");
    }

    // DELETE NODE
    void deleteNode(int data) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        // Delete head
        if (head.data == data) {
            deleteFront();
            return;
        }

        // Delete other node
        Node current = head;

        while (current != null) {
            if (current.data == data) {

                // If target is tail
                if (current == tail) {
                    deleteBack();
                    return;
                }

                current.prev.next = current.next;
                current.next.prev = current.prev;

                return;
            }

            current = current.next;
        }

        System.out.println("Target Not Found");
    }

    // ADD AFTER TARGET
    void addAfter(int targetData, int data) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        while (current != null) {

            if (current.data == targetData) {

                Node newNode = new Node(data);

                newNode.next = current.next;
                newNode.prev = current;

                if (current.next != null) {
                    current.next.prev = newNode;
                }

                current.next = newNode;

                // If added after tail
                if (current == tail) {
                    tail = newNode;
                }

                return;
            }

            current = current.next;
        }

        System.out.println("Target Not Found");
    }

    // ADD BEFORE TARGET
    void addBefore(int targetData, int data) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        // If target is head
        if (head.data == targetData) {

            Node newNode = new Node(data);

            newNode.next = head;
            head.prev = newNode;
            head = newNode;

            return;
        }

        Node current = head;

        while (current != null) {

            if (current.data == targetData) {

                Node newNode = new Node(data);

                newNode.next = current;
                newNode.prev = current.prev;

                current.prev.next = newNode;
                current.prev = newNode;

                return;
            }

            current = current.next;
        }

        System.out.println("Target Not Found");
    }

    // DISPLAY FORWARD
    void displayForward() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    // DISPLAY BACKWARD
    void displayBackward() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = tail;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }

        System.out.println();
    }

    // UPDATE NODE
    void updateNode(int oldData, int newData) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        while (current != null) {

            if (current.data == oldData) {
                current.data = newData;
                return;
            }

            current = current.next;
        }

        System.out.println("Target Not Found");
    }

    // MAKE CIRCULAR
    void makeCircular() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        tail.next = head;
        head.prev = tail;
    }

    // DISPLAY FORWARD FOR CIRCULAR LIST
    void displayCircularForward() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    // DISPLAY BACKWARD FOR CIRCULAR LIST
    void displayCircularBackward() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = tail;

        do {
            System.out.print(current.data + " ");
            current = current.prev;
        } while (current != tail);

        System.out.println();
    }
}


// MAIN CLASS
public class Main {

    public static void main(String[] args) {

        DoublyLinkedList doubly = new DoublyLinkedList();

        // ADD NODES
        doubly.addBack(10);
        doubly.addBack(20);
        doubly.addBack(30);
        doubly.addBack(40);

        System.out.println("Before Making Circular:");

        doubly.displayForward();
        doubly.displayBackward();


        // MAKE CIRCULAR
        doubly.makeCircular();

        System.out.println("\nAfter Making Circular:");

        doubly.displayCircularForward();
        doubly.displayCircularBackward();
    }
}
