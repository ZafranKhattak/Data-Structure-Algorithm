class SimpleQueue {
    int arr[];
    int front;
    int rear;
    int size;
    int count;

    public SimpleQueue(int size) {
        this.count = 0;
        this.front = -1;
        this.rear = -1;
        this.size = size;
        arr = new int[size];
    }

    // ENQUEUE METHOD
    void enQueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
            return;
        }

        rear++;
        arr[rear] = data;
        count++;
        System.out.println(data + " Value is added");

    }

    // DEQUEUE METHOD
    void deQueue() {
        if (count == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        front++;
        int value = arr[front];
        count--;
        System.out.println(value + " is Removed");
    }

    // PEEK METHO
    public int peek()
    {
        if(count == 0)
        {
            System.out.println("Queue is Emtpy");
            return -1;
        }

        int value = arr[front];
        return  value;
    }
}

class Main {
    public static void main(String[] args) {

        SimpleQueue simple = new SimpleQueue(5);
        simple.enQueue(1);
        simple.enQueue(2);
        simple.enQueue(3);
        simple.enQueue(4);
        simple.enQueue(5);
        simple.deQueue();
        System.out.println("Front value is: " +simple.peek());
    }
}
