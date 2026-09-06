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

class Main 
{
    public static void main(String args[])
    {
        Node n0 = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        // Linking
        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // DELETE 30

        Node head = n0;
        Node current = head;

        while(current.next.next != null)
        {
            if(current.next.data == 30)
            {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        
        current = head;

        while(current !=null)
        {
            System.out.print(current.data + " ");

            current = current.next;
        }
    }
}