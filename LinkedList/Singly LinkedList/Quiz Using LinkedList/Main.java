class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// ==================== LINKEDLIST ======================

class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // ==================== INSERT METHOD =====================
    void insert(int value) {
        Node addValue = new Node(value);

        if (head == null) {
            head = addValue;
            tail = addValue;
        } else {
            tail.next = addValue;
            tail = addValue;
        }
    }

    // ===================== NOW LIST METHOD AND LOGIC ============

    void listMethod() {
        Node current = head;

        int max1 = current.data;
        int min1 = current.data;
       
        while (current != null) {

            if (current.data % 3 == 0) {
                System.out.println("Divide by 3 ->" + current.data + " ");
            } else if (current.data % 5 == 0) {
                System.out.println("Divide by 5 -> " +current.data + " ");
                
            } else if (current.data % 3 != 0 && current.data % 5 != 0) {
                System.out.println("Divide by not 3 nor 5-> " +current.data + " ");
               
            }
            current = current.next;
        }

        System.out.println(max1 + " " + " " + min1);
    }
}
      
class Main {
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(6);
        list.insert(9);
        list.insert(10);
        list.insert(15);
        list.insert(11);
        list.insert(13);
        list.insert(17);

        list.listMethod();
    }
}