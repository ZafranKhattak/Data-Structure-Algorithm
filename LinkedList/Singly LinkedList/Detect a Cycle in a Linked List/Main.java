class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class DetectCycle {
    Node head;
    Node tail;

    DetectCycle() {
        this.head = null;
        this.tail = null;
    }

    // ===================== ADDFRONT METHOD =================;

    void addFront(int data) {
        Node addValue = new Node(data);
        if (head == null) {

            head = addValue;
            tail = addValue;
            System.out.print(data + " ");
            return;
        }

        tail.next = addValue;
        tail = addValue;
        tail.next = head;
        System.out.print(data + " ");
    }

    // ==================== DETECT CYCLE METHOD ==================

    void detectCycle() {

        if(head == null)
        {
            System.out.println("No element found");
            return ;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Cycle Found");
                return ;
            }
        }
            System.out.println("Cycle not found");
    }
}

// ===================== MAIN CLASS =======================
class Main {
    public static void main(String[] args) {

        DetectCycle cycle = new DetectCycle();
        cycle.addFront(10);
        cycle.addFront(20);
        cycle.addFront(30);
        cycle.addFront(40);
        cycle.addFront(50);

        cycle.detectCycle();
    }
}