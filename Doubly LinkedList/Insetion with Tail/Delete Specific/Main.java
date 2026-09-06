class Node 
{
    Node prev;
    int  data;
    Node next;

    public Node(int data)
    {
        this.prev = null;
        this.data = data ;
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

    // ADD AT BACK
    void addBack(int data)
    {
        Node addAtBack = new Node(data);
        if (head == null)
        {
            head = addAtBack;
            tail = addAtBack;
            return ;
        }
        else 
        {
            tail.next = addAtBack;
            addAtBack.prev = tail;
            tail = addAtBack;
        }
    }

    // DELETE SPECIFIC 
   void deleteSpecific(int data)
{
    if (head == null)
    {
        System.out.println("List is Empty");
        return;
    }

    // Target first node
    if (head.data == data)
    {
        if (head == tail)   // only one node
        {
            head = null;
            tail = null;
        }
        else
        {
            head = head.next;
            head.prev = null;
        }
        return;
    }

    Node current = head;

    while (current != null)
    {
        if (current.data == data)
        {
            // Target is last node
            if (current == tail)
            {
                tail = tail.prev;
                tail.next = null;
            }
            else
            {
                // Target is middle node
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }

            return;
        }

        current = current.next;
    }

    System.out.println("Data not found");
}
     // DISPLAY METHOD
    void  display()
    {
        if(head == null)
        {
            System.out.print("List is Empty");
            return ;
        }
        
        Node current = head;

        while(current != null)
        {
            System.out.print(current.data + " ");

            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        DoublyLinkedList doubly = new DoublyLinkedList();
        
        doubly.addBack(10);
        doubly.addBack(20);
        doubly.addBack(30);
        doubly.addBack(40);
        doubly.addBack(50);
        doubly.addBack(60);
        doubly.deleteSpecific(30);
        doubly.display();
    }
}

