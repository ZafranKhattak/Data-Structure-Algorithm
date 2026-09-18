import java.util.Scanner;

class Stack
{
    int [] array;
    int size;
    int count;

    public Stack(int size)
    {
        this.size = size;
        array = new int[size];
        this.count = 0;
    }

    // ================ PUSH METHOD ====================
    void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
            return;
        }

        array[count] = data;
        count++;
        System.out.println("Value " + data + " has been added");
    }

    // ================= POP METHOD =====================
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Emtpy");
            return 0;
        }

        int value = array[count-1];
        count--;
        return  value;
    }

    // ================= ISEMPTY METHOD ==================
    boolean isEmpty() 
    {
       return  count == 0;
    }

    // ================== ISFULL METHOD ===================
    boolean isFull()
    {
        return  count == size;
    }

    // ================== PEEK METHOD =====================
    int peek()
    {
        return array[count-1];
    }

    // ================== SEARCH VALUE ====================

    boolean search(int value)
    {
        Stack stk  = new Stack(5);
        while (!isEmpty()) {
            
            int found = pop();

            if(found== value)
                return  true;

            stk.push(found);
        }

        return  false;
    }
}

class Main 
{
    public static void main(String[] args) {
        
        Stack stk = new Stack(5);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter  Value to search: ");
         int value = inp.nextInt();
        System.out.println(stk.search(value));
        inp.close();
    }
}