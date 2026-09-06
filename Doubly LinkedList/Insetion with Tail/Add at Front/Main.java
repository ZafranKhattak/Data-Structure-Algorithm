class Node 
{
    Node prev;
    int  data;
    Node next;

    public Node(int data)
    {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

class DoublyLinkedList
{
    Node head;
    Node tail;

    public DoublyLinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    // add AT Front

    void addFront(int data)
    {
        Node addAtFront = new Node(data);
        if (head == null)
        {
            head = addAtFront;
            tail = addAtFront;
            return ;
        }
        else 
        {
            addAtFront.next = head;
            head.prev = addAtFront;
            head = addAtFront;
        }
    }

    void display()
    {
        if(head == null)
        {
            System.out.print("List is Empty");
            return ;
        }

        Node current = head;
        while (current !=null) {
            
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        
        DoublyLinkedList doubly = new DoublyLinkedList();

        doubly.addFront(10);
        doubly.addFront(20);
        doubly.display();
    }    
}
