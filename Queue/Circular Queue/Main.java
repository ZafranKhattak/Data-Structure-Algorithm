class CircularQueue {
    int arr[];
    int front;
    int back;
    int size;
    int count;

    public CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        this.front = -1;
        this.back = -1;
        this.count = 0;
    }

    // ENQUEUE
    void enqueue(int data) {
        if (size == count) {
            System.out.println("Queue is Full");
            return;
        }

        back = (back + 1) % size;
        arr[back] = data;
        count++;
        System.out.println(data + " has been added Successfully");
    }

    // DEQUEUE
    void dequeue()
    {
        if(count == 0)
        {
            System.out.println("Queue is Empty");
            return ;
        }

        front = (front  + 1) % size;
        int value = arr[front];
        count--;
        System.out.println(value +" Has Been Successfully Removed");
    }
}

class Main {
    public static void main(String[] args) {

        CircularQueue circle = new CircularQueue(5);
        circle.enqueue(10);
        circle.enqueue(20);
        circle.enqueue(30);
        circle.enqueue(40);
        circle.enqueue(50);
        circle.dequeue();
        circle.dequeue();
        circle.dequeue();
        circle.dequeue();
        circle.dequeue();
        circle.dequeue();

    }
}