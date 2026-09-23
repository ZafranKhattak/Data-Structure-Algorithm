class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    void display() {
        System.out.println(data);
    }
}

// ================= QUEUE CLASS =================
class Queue {
    Node front;
    Node back;

    Queue() {
        this.front = null;
        this.back = null;
    }

    // ============== ENQUEUE METHOD ==================
    void enQueue(int data) {
        Node addFront = new Node(data);
        if (isEmpty()) {
            back = addFront;
            front = addFront;
        }

        front.next = addFront;
        front = addFront;
    }

    // ============== DEQUEUE METHOD ===================
    int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = back.data;
        back = back.next;
        if (back == null) {
            System.out.println("Queue is Emtpy");
            front = null;
        }
        return value;
    }

    // ============== DISPLAY METHOD ==============
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Emtpy");
            return;
        }

        Node current = back;

        while (current != null) {
            System.out.println("Value " + current.data + " has been added");

            current = current.next;
        }
    }

    // ============== PEEK METHOD ==============
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return back.data;
    }
    // ============== ISEMPTY METHOD ==============

    boolean isEmpty() {
        return front == null;
    }
}

class Main {
    public static void main(String args[]) {

        Queue list = new Queue();
        list.enQueue(10);
        list.enQueue(20);
        list.enQueue(30);
        list.enQueue(40);
        list.enQueue(50);
        list.enQueue(60);
        list.enQueue(70);

        list.display();
        // System.out.println("The Dequeue Value is: " + list.deQueue());
        // System.out.println("The Dequeue Value is: " + list.deQueue());
        System.out.println("Current Value : " + list.peek());
    }
}