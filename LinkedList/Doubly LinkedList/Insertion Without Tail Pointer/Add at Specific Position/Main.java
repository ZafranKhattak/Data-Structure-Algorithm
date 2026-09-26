class Node 
{
    Node prev;
    int data;
    Node next;

    public Node(int data)
    {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}
public class Main {
    public static void main(String[] args) {
        
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        // Linking Node

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        n4.next = n5;
        n5.prev = n4;

        Node head = n1;
        Node current = head;

        Node n0 = new Node(25);
        while(current != null)
        {
            if (current.data == 20)
            {
                n0.next = current.next;
                current.next.prev = n0;

                current.next = n0;
                n0.prev = current; 
            }
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
}


