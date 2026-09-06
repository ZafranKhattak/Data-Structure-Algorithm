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

    // ADD AT Specific Postion
    void addSpecificPostion(int target ,int data )
    {
        Node addSpecificPostion = new Node(data);
        if (head == null)
        {
            head = addSpecificPostion;
            tail = addSpecificPostion;
            return ;
        }
       
        Node current = head;

        while (current !=null) {

            if(current.data == target)
            {
                addSpecificPostion.next = current.next;
                current.next.prev = current;

                current.next = addSpecificPostion;
                addSpecificPostion.prev = current;
            }

            current = current.next;
        }
    }

    // DISPLAY DOUBLY LINKEDLIST
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

        doubly.addBack(10);
        doubly.addBack(20);
        doubly.addBack(30);
        doubly.addBack(40);
        doubly.addBack(50);
        doubly.addBack(60);

        doubly.addSpecificPostion(20,25);
        doubly.display();
    }    
}


