class Node {
    int data;
    Node next;

    Node(int value) {
        this.data = value;
        this.next = null;
    }
}

// ============== CLASS MERGEDTWOSROTED LINKED LIST ===============

class MergedSortedLinkedList {
    Node head1;
    Node head2;
    Node tail1;
    Node tail2;

    MergedSortedLinkedList() {
        this.head1 = null;
        this.head2 = null;
        this.tail1 = null;
        this.tail2 = null;
    }

    // ==================== SORT 1 METHOD ====================
    void sortFirst(int data) {
        Node addFront = new Node(data);
        if (head1 == null) {
            head1 = addFront;
            tail1 = addFront;
            return;
        }
        tail1.next = addFront;
        tail1 = addFront;

    }

    // ==================== SORT 2 METHOD ====================
    void sortSecond(int data) {
        Node addFront = new Node(data);
        if (head2 == null) {
            head2 = addFront;
            tail2 = addFront;
            return;
        }

        tail2.next = addFront;
        tail2 = addFront;
    }

    // =========== MERGED SORTFIRST AND SORTSECOND ==============

    Node mergingLinkedList() {

        if (head1 == null || head2 == null) {
            System.out.print("One LinkedList is Empty");
            return null;
        }

        Node current = head1;
        Node temp = head2;

        while (current != null && temp != null) {

            Node selected;

            if (current.data < temp.data) {
                selected = current;
                current = current.next;
            } else {
                selected = temp;
                temp = temp.next;
            }
        }

        
    }

    // ================== CLASS MAIN =================

class Main {
    public static void main(String[] args) {
        MergedSortedLinkedList list = new MergedSortedLinkedList();
        list.sortFirst(10);
        list.sortFirst(20);
        list.sortFirst(30);

        // ========== second sort ================
        list.sortSecond(40);
        list.sortSecond(50);
        list.sortSecond(60);
        list.mergingLinkedList();
    }
}