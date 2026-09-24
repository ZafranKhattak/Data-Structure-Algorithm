class Stacks {
    int array[];
    int size;
    int top;

    Stacks(int size) {
        this.size = size;
        array = new int[size];

        this.top = -1;
    }

    // ===================== PUSH METHOD =====================
    void push(int data) {
        if (isFull()) {
            return;
        }

        array[top + 1] = data;
        top++;
    }

    // ===================== POP METHOD =====================
    int pop() {
        if (isEmpty()) {
            return 0;
        }
        int value = array[top];
        top--;

        return value;

    }

    // ===================== ISEMTPY METHOD =====================
    boolean isEmpty() {
        return top == -1;
    }

    // ===================== FULL METHO ======================

    boolean isFull() {
        return top == size - 1;
    }
}

    // ==================== QUEUEUSINGSTACKS CLASS ====================
class QueueUsingStacks {

    Stacks stack1;
    Stacks stack2;

    QueueUsingStacks() {
        stack1 = new Stacks(5);
        stack2 = new Stacks(5);
    }

    // ===================== ENGQUE METHOD =====================
    void enqueue(int data) {

        
        stack1.push(data);
    }

    // ===================== DEQUE
    int deque() {
        
        if(stack1.isEmpty())
        {
            return  0;
        }

        while(stack1.top >0)
        {
            stack2.push(stack1.pop());
        }

        int result = stack1.pop();

        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
        return  result;
    }

    // ======================= PEEK METHOD =======================

    int peek()
    {
        int value = stack1.array[stack1.top];
        return value;
    }
}

public class Main {

    public static void main(String args[]) {
        QueueUsingStacks stk = new QueueUsingStacks();
        stk.enqueue(1);
        stk.enqueue(2);
        stk.enqueue(3);
        stk.enqueue(4);
        stk.enqueue(5);

        System.out.println(stk.deque());
        System.out.println(stk.peek());
    }
}
