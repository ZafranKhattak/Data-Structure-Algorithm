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

        // DELETE FROM THE BEGINNING

         Node head = n1;
         head = head.next;
       
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}