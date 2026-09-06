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

        n1.next = n2;
        n2.prev = n1;

        Node head = n1;
        Node current = head;

        while(current != null) 
        {
            System.out.print(current.data + " ");

            current = current.next;
        }
    }    
}
