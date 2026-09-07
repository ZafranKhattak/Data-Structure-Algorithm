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
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        // Linking Node

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;

        Node head = n1;
        Node current = head;

        do {
            System.out.print(current.data + " ");

            current = current.next;
        }
        while (current !=head);

    }
}