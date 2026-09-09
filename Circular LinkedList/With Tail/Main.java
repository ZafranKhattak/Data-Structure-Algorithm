class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkList {
    Node head;
    Node tail;

    public CircularLinkList() {
        this.head = null;
        this.tail = null;
    }

    // ADD FRONT METHOD
    void addFront(int data) {
        Node addFront = new Node(data);
        if (head == null) // LIST IS EMPTY
        {
            head = addFront;
            tail = addFront;

            tail.next = head;
            return;
        }

        addFront.next = head;
        head = addFront;
        tail.next = head;
    }

    // ADD BACK METHOD
    void addBack(int data) {
        Node addBack = new Node(data);
        if (head == null) {
            head = addBack;
            tail = addBack;

            tail.next = head;

            return;
        }

        tail.next = addBack;
        addBack.next = head;
        tail = addBack;
    }

    // DELETE FRONT
    void deleteFront() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == tail) {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        tail.next = head;
    }

    // DELETE BACK METHOD
    void deleteBack() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.next == tail) {
            head = null;
            tail = null;
            return;
        }

        Node current = head;

        while (current.next != tail) {
            current = current.next;
        }

        tail = current;
        tail.next = head;

    }

    // SEARCH NODE
    void search(int target) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;
        while (current != tail) {
            if (current.data == target) {
                System.out.print("Target Found");
                return;
            }
            current = current.next;
        }
        System.out.print("Target Not Found");
    }

    // UPDATED NODE
    void updateNode(int old, int newVlue) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;
        while (current != tail) {
            if (current.data == old) {
                current.data = newVlue;
            }

            current = current.next;
        }
    }

    // DELETE SPECIFIC NODE
    void deleteNode(int data)
    {
        if(head == null)
        {
            System.out.print("List is Empty");
            return ;
        }

        Node current = head;

        while (current.next.next != tail) {
                if(current.next.data == data)
                {
                    current.next = current.next.next;
                }

                current = current.next.next;
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

    // ADD BEFORE TARGET METHOD
     void addBefore(int targetData,int data)
    {
        Node addBefore = new Node(data);

        if(head.next == head)
        {
            addBefore.next = head;
            head = addBefore; 
        }
        Node current = head;
        while(current.next != head)
        {
            if(current.next.data == targetData)
            {
                addBefore.next = current.next;
                current.next = addBefore;
                return ;
            }
            current = current.next;
        }
    }
    

    // DISPLAY METHOD
    void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
    }
}

// MAIN CLASS
class Main {
    public static void main(String args[]) {
        CircularLinkList list = new CircularLinkList();
        list.addFront(10);
        list.addFront(20);
        list.addFront(30);

        list.addBack(40);
        list.addBack(50);
        list.addBack(60);
        list.deleteBack();

        list.search(20);
        list.updateNode(20, 200);
        list.deleteFront();
        list.addBefore(10,30);
        list.addAfter(20, 0);
        list.display();
    }
}