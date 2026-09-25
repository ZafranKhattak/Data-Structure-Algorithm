class Heap
{
    int heap[];
    int size;
    int capacity;

    Heap(int capacity)
    {
        this.capacity = capacity;
        heap = new int[capacity];
        this.size = 0;
    }

    // ================== INSERT VALUES METHOD =====================
    void insert(int value)
    {
        if(size == capacity)
        {
            System.out.println("Heap is Full!");
            return ;
        }

        heap[size] = value;
        int current = size;
        size++;

        shiftUp(current);
    }

    // ================== SHIFT UP METHOD ========================
    void shiftUp(int index)
    {
        int current = index;
        while(current > 0)
        {
            int parent = (size -1)/2;

            if(heap[current] > heap[parent])
            {
                int temp = heap[current];
                heap[current] = heap[parent];
                heap[current] = temp;
                current = temp;
            }
            else
            {
                break;
            }
        }
    }

    // ===================== PRINT OR DISPLAY METHOD ====================

    void printHeap()
    {
        for (int i=0; i<size-1; i++)
        {
            System.out.print(heap[i] + " ");
        }

    }
}


class Main 
{
    public static void main(String args[])
    {
            Heap hp = new Heap(5);
            hp.insert(10);
            hp.insert(20);
            hp.insert(30);
            hp.insert(40);
            hp.insert(50);

            hp.printHeap();
    }
}