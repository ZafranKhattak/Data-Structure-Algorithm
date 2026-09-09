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

class CircularLinkedList 
{
    Node head;

    // has Cycle

    boolean cycleChecking()
    {
        if(head == null)
        {
            System.out.print("List is Empty");
        }

        Node fast = head;
        Node slow = head;


        while(fast !=null && fast.next !=null)
        {
             slow = slow.next;
             fast = fast.next.next;

             if(fast == slow){
                return  true;
             }
        }
        return  false;
    }
}


class Main 
{
    public static void main (String args[])
    {
        CircularLinkedList list = new CircularLinkedList();

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        list.head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = list.head;

        if(list.cycleChecking())
        {
            System.out.print("Cycle Detected");
        }
        else 
        {
            System.out.print("No cycle detected");
        }
    }
}