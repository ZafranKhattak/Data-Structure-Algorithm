class Stack 
{
    int array[];
    int size;
    int top;

    Stack(int size)
    {
        this.size = size;
        this.top = -1;
        array = new int[size];
    }

    // ===================== PUSH METHOD ======================
    void push(int data)
    {
        if(isFull())
        {
            return;
        }

        array[top+1] = data;
        top++;
    }

    // ===================== POP METHOD =========================
    int pop()
    {
        if(isEmpty())
        {
            return -1;
        }

        int value = array[top-1];
        top--;

        return value;
    }

    // ===================== ISEMPTY METHOD =====================
    boolean isEmpty()
    {
        return top == -1;
    }

    // ===================== ISFULL METHOD =====================
    boolean isFull()
    {
        return top == size -1;
    }
}

    // ===================== QUEUE CLASS   ====================

class Queue 
{
   Stack stack ;
   int array[];
   int size;
   int tail;
   int front;

   public Queue(int size)
   {
        stack = new Stack(size);
        array = new int[size];
        this.size = size;
        this.tail = 0;
        this.front = 0;
   }

   // ===================== ENQUEUE METHOD  =====================

   void enQueue(int data)
   {
        if(isFull())
        {
            return ;
        }

        array[tail] = data;
        tail++;
   }

    // ===================== DEQUEUE METHOD =====================
    int deQueue()
    {
        if(isEmpty())
        {
            return -1;
        }

        int value = array[front];
        stack.push(value);
        front++;
        return value;
    }

    // ===================== REVERSE QUEUE METHOD ===============
    void reverseQueue()
    {
        if(stack.isEmpty())
        {
            System.out.println("Queue is Empty !");
            return ;
        }

        int value = 0;
        while(stack.top > 0)
        {
            value = stack.pop();
        }

    }
    // ===================== ISEMPTY METHOD =====================
    boolean isEmpty()
    {
        return size == 0;
    }

    // ===================== ISFULL METHOD =====================
    boolean isFull()
    {
        return  size == 0;
    }
}


class Main
{
    public static void main(String args[])
    {

    }
}