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
            return ;
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
            return ;
        }

        tail2.next = addFront;
        tail2 = addFront;
    }

    // =========== MERGED SORTFIRST AND SORTSECOND ==============

    void displayMerging() {

        if (head1 == null || head2 == null) {
            System.out.print("One LinkedList is Empty");
            return;
        }

        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.println(temp.data);
        temp.next = head2;

        Node temp2 = head1;
        while (temp2 != null) {
            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
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
        list.sortSecond(40);
        list.sortSecond(50);
        list.sortSecond(60);
        list.displayMerging();
    }
}