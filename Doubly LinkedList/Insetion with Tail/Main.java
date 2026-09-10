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

    // add AT Front
    void addFront(int data) {
        Node addAtFront = new Node(data);
        if (head == null) {
            head = addAtFront;
            tail = addAtFront;
            return;
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
            return;
        } else {
            tail.next = addAtBack;
            addAtBack.prev = tail;
            tail = addAtBack;
        }
    }

    // ADD AT Specific Postion
    void addSpecificPostion(int target, int data) {
        Node addSpecificPostion = new Node(data);
        if (head == null) {
            head = addSpecificPostion;
            tail = addSpecificPostion;
            return;
        }

        Node current = head;

        while (current != null) {

            if (current.data == target) {
                addSpecificPostion.next = current.next;
                current.next.prev = addSpecificPostion;

                current.next = addSpecificPostion;
                addSpecificPostion.prev = current;
                break;
            }

            current = current.next;
        }
    }

    // DELETE FROM BACK
    void deleteBack() {
        if (head == null) {
            System.out.print("List is Empty");
        } else if (head == tail) // if there is one Node available
        {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // DELETE FROM FRONT
    void deleteFront() {
        if (head == null) {
            System.out.print("List is Empty");
            return;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

    }

    // SEARCH METHOD
    void searchNode(int data) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;
        while (current != tail) {
            if (current.data == data) {
                System.out.print("Target Found");
                return;
            }

            current = current.next;
        }

        System.out.print("Target Not Found");
    }

    // UPDATED NODE
    void updateNode(int oldData, int newData) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;
        while (current != tail) {
            if (current.data == oldData) {
                current.data = newData;
                return;
            }

            current = current.next;
        }
    }

    // ADD After TARGET
    void addAfter(int targetData, int data) {
        Node addAfter = new Node(data);
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;
        while (current != tail) {
            if (current.data == targetData) {
                addAfter.next = current.next;
                addAfter.prev = current;
                current.next = addAfter;
            }

            current = current.next;
        }
    }
    // ADD BEFORE TARGET
    void addBefore(int targetData, int data) {
        Node addBefore = new Node(data);
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.next.data == targetData) {
                addBefore.next = current.next;
                addBefore.prev = current;
                current.next = addBefore;
                addBefore.next.prev = addBefore;
            }

            current = current.next;
        }
    }

    // DISPLAY FORWARD
    void forwarddisplay() {
        if (head == null) {
            System.out.print("List is Empty");
            return;
        }

        Node current = head;
        while (current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // DISPLAY BACKWORD
    void displayBackward(){
         if (head == null) {
            System.out.print("List is Empty");
            return;
        }
        
        Node current = tail;
        while(current !=null)
        {
            System.out.print(current.data+ " ");
            current = current.prev;
        }
    }
}

// MAIN CLASS
public class Main {
    public static void main(String[] args) {

        DoublyLinkedList doubly = new DoublyLinkedList();

        doubly.addFront(10);
        doubly.addFront(20);
        doubly.forwarddisplay();
        doubly.displayBackward();
    }
}
