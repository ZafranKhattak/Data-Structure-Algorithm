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

        Node head = n0;
        Node temp = head;

       while(temp !=null)
       {
            if(temp.data == 30)
            {
                temp.data = 300;
            }
            System.out.print(temp.data + " ");

            temp = temp.next;
       }

       }
    }

