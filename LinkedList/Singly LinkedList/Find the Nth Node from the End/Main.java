class Node 
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    Node head;
    Node tail;

    LinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // =================== FindingMiddleElmenent ================

    void findingNth(int n)
{
    if (head == null) {
        System.out.println("LinkedList is Empty!");
        return;
    }

    Node first = head;
    Node second = head;

    for (int i = 0; i < n; i++) {
        if (first == null) {
            System.out.println("Invalid n");
            return;
        }
        first = first.next;
    }

    while (first != null) {
        first = first.next;
        second = second.next;
    }

    System.out.println("Nth Node is " + second.data);
}
}
public class Main {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8};
        LinkedList list = new LinkedList();
        for(int num : array)
        {
            list.add(num);
        }

        list.findingNth(3);
    }
}
