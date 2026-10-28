class Stack {
    int arr[];
    int top;
    int capacity;

    Stack(int capacity) {
        arr = new int[capacity];
        this.top = -1;
        this.capacity = capacity;

    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full!");
            return;
        }

        arr[top + 1] = data;
        top++;

    }

    // =============== POP METHOD =================

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int value = arr[top];

        top--;
        return value;
    }

    // ================ PEEK METHOD ==================

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // ================ ISMPTY METHOD ==================
    boolean isEmpty() {
        return top == -1;
    }

    // ================ ISFULL METHOD =================
    boolean isFull() {
        return top == capacity - 1;
    }

    // ================ SIZE METHOD ===============
    int size() {
        return top + 1;
    }

    // ================= COUNT REPEADED NUMBER ==========
    int countOccurrences(Stack stack, int x) {
        int count = 0;

        Stack copy = new Stack(stack.capacity);

        while(!stack.isEmpty())
        {
            int temp = pop();

            if(temp == x)
            {
                count++;
            }

            copy.push(temp);
        }

        while (!copy.isEmpty()) {

            int re = copy.pop();
            stack.push(re);
        }

        return count;
    }

    // ================= MAXIMUM NUMBER METHOD ==========
    int findMaximum(Stack stack) {
        if (stack.isEmpty()) {
            System.out.println("List is Empty");
            return -1;
        }

        Stack temp = new Stack(stack.capacity);
        int max = stack.peek();

        while (!stack.isEmpty()) {
            int re = stack.pop();
            if (re > max)
                max = re;
            temp.push(re);
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return max;
    }

    // ================= DISPLAY METHOD =================
    void display() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Main {
    public static void main(String args[]) {

        Stack stk = new Stack(5);
        int arr[] = { 5, 3, 3, 4, 1 };

        for (int num : arr) {
            stk.push(num);
        }

        stk.display();
        System.out.println();
        System.out.println("==================");
        System.out.println(stk.peek());
        System.out.println(stk.size());
        System.out.println(stk.pop());

        System.out.println("==================");
        int result = stk.countOccurrences(stk, 3);
        System.out.println("Ocurred " + result);
        stk.display();
        System.out.println();

        System.out.println(stk.peek());

        System.out.println(stk.findMaximum(stk));
        System.out.println(stk.peek());
        stk.display();
        System.out.println(stk.peek());
        stk.display();

        // solve for more
        
    }
}