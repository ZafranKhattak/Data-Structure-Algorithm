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

    // ===================== DISPLAY METHOD =====================

    void display() {
        Node current = head;

        while (current != null) {

            System.out.print(current.data + "->");
            current = current.next;
        }

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

        LinkedList value3 = new LinkedList();
        LinkedList value5 = new LinkedList();
        LinkedList notVlaue = new LinkedList();

        Node current = list.head;

        while (current !=null) {
            
            if(current.data % 3 == 0)
            {
                value3.insert(current.data);
            }else if(current.data % 5 == 0)
            {
                value5.insert(current.data);
            }
            else 
            {
                notVlaue.insert(current.data);
            }

            current = current.next;
        }

        System.out.print("Value Divied by 3 -> ");
        value3.display();
        System.out.println();

        System.out.print("Value Divied by 5 -> ");
        value5.display();
        System.out.println();

        System.out.print("Value Divied by not 3 and 5 -> ");
        notVlaue.display();
        System.out.println();
    }
}