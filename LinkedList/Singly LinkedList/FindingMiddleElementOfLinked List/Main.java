class Node 
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList
{
    Node head;
    Node tail;

    LinkedList()
    {
        this.head = null;
        this.tail = null;
    }

    void add(int data)
    {
        Node newNode = new Node(data);
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

    // =================== FindingMiddleElmenent ================

    void findingMiddle()
    {
            if(head ==null)
            {
                System.out.println("LinkedList is Empty!");
                return ;
            }

            Node slow = head;
            Node fast = head;

            while(fast !=null && fast.next !=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }

            System.out.println("Middle Element is " + slow.data);
    }
}
public class Main {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7};
        LinkedList list = new LinkedList();
        for(int num : array)
        {
            list.add(num);
        }

        list.findingMiddle();
    }
}
