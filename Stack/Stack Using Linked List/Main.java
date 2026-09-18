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

// ================== STACK CLASS =================

class Stack 
{
    Node top;

    public  Stack()
    {
        this.top = null;
    }
    // ============== PUSH METHOD ================
    
    void push(int value)
    {
        Node addBack = new Node(value);
        if(isEmpty())
        {
            top = addBack;
            return ;
        }

        addBack.next = top;
        top = addBack;
    }

    // ============== POP METHOD =================
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
    
        int value = top.data;
        top = top.next;
        if(top == null)
        {
            top = null;
        }
        return value;
    }

    // ============== ISEMPTY METHOD =============
    boolean isEmpty()
    {
        return  top == null;
    }

    // ============== DISPLAY METHOD =============

    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return ;
        }

        Node current = top;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // ============== PEEK METHOD =================
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }

        int value = top.data;
        return  value;
    }
}
// ================== MAIN CLASS ==================
class Main 
{
    public static void main(String args[])
    {
        Stack stk = new Stack();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        System.out.println("Value has been " + stk.pop());
        System.out.println("Value has been " + stk.pop());
        System.out.println("Value has been " + stk.pop());
        System.out.println("Value has been " + stk.pop());
        System.out.println("Value has been " + stk.pop());
        System.out.println("Value has been " + stk.pop());

        // System.out.println("Top value is " + stk.peek());
        // stk.display();
    }
}