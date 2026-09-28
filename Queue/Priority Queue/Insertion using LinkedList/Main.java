class Node {
    int data, priority;
    Node next;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

// ================ PRIORITY QUEUE INSERTION ====================

class PriorityQueue {
    Node head;

    PriorityQueue() {
        this.head = null;
    }

    // =============== ENQUEUE METHOD ================
    void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);
        if (head == null) {
            head = newNode;
            return;
        }

        if (priority < head.priority) {
            newNode.next = head;
            head = newNode;

            return;
        }

        Node current = head;

        while (current.next != null && current.next.priority <= priority) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        System.out.println(data + " ");
    }
}

class Main {
    public static void main(String[] args) {
        PriorityQueue pr = new PriorityQueue();
        pr.enqueue(30, 3);
        pr.enqueue(20, 2);
        pr.enqueue(10, 1);

    }
}