class Node 
{
    int data ;
    Node next;

    public Node(int data)
    {
        this.data = data ;
        this.next = null;
    }
}

class Main 
{
    public static void main(String args[])
    {
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);

        n1.next = n2;
        n2.next = n3;

        Node head = n1;

        // INSET AT THE BEGINNING
        Node n0 = new Node(10);
        n0.next = head;
        head = n0;
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}