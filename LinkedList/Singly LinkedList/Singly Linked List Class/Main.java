interface List 
{
    
    public boolean isEmpty();
    public int size();
    public void add(Node n);
    public void add(int data, Node n);
    public void remove(int data);
    public void remove(Node n);
    public LinkedList Duplicate();
    public LinkedList DuplicateReverse();
    
}

         // =================  CLASS NODE =====================

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

        // ================== LINKEDLIST CLASS ===============
class LinkedList implements List
{
    Node head;
    LinkedList()
    {
        this.head = null;
    }

    public boolean isEmpty()
    {

    }
} 
public class Main {
    
}
