class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
        // ========== LINKEDLIST CLASS =====
class LinkedList 
{
    Node head;
    Node tail;

    LinkedList()
    {
        this.head = null;
        this.tail = null;
    }

        // ========== INSERT METHOD ========

        void insert(int value)
        {
            Node newNode = new Node(value);
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
    
        // ========== DISLPLAY LIST ========

        void display()
        {
            
            if(head == null)
            {
                System.out.println("List is Empty");
                return ;
            }

            Node current = head;
            while(current !=null)
            {
                
                System.out.print(current.data + " ");

                current = current.next;
            }
        }
}

        // ========== CLASS MAIN ===========
class Main
{
    public static void main(String args[])
    {
       LinkedList main = new LinkedList();
        main.insert(10);
        main.insert(20);
        main.insert(30);
        main.insert(40);
        main.insert(50);
        main.insert(60);
        main.insert(70);
        main.insert(80);
        main.insert(90);
        main.insert(100);

        LinkedList low = new LinkedList();
        LinkedList high = new LinkedList();
        LinkedList medium = new LinkedList();
        Node current = main.head;

        while(current !=null)
        {
            if(current.data < 50)
            {
                low.insert(current.data);
            }
            else if(current.data >=50 && current.data < 70)
            {
                medium.insert(current.data);
            }
            else
            {
                high.insert(current.data);
                
            }

            current = current.next;
        }
       
        System.out.print("Low Value -> " );
        low.display();
        System.out.println();

        System.out.print("Medium Value -> ");
        medium.display();
        System.out.println();
        
        System.out.print("High Value -> " );
        high.display();

    }
}