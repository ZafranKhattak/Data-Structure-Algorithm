class Queue {
    String process[];
    int size;
    int first;
    int last;

    Queue(int size) {
        this.size = size;
        process = new String[size];
        this.first = 0;
        this.last = 0;
    }

    // ================ Add Process Method ==============
    void addProcess(String value) {
        if (isFull()) {
            System.out.println("CPU is full");
            return;
        }

        process[last] = value;
        last++;
    }

    // ================ EXECUTE PROCESS METHOD ==========
    String executeProcess() {
        if (isEmpty()) {
            System.out.println("CPU is Empty");
            return null;
        }

        String result = process[first];
        first++;

        return result;
    }

    // ================ DISPLAY WAITING TASK ============
    void display() {
        if (isEmpty()) {
            System.out.println("CPU is Empty");
            return;
        }

        for (int i = first; i < last; i++) {
            System.out.println(process[i]);
        }
    }

    // ================ FULL METHOD ====================
    boolean isFull() {
        return size == last;
    }

    // ================ EMTPY METHOD ====================
    boolean isEmpty() {
        return first == last;
    }
}

// ====================== MAIN CLASS ======================
public class Main {
    public static void main(String args[]) {
        Queue process = new Queue(5);
        process.addProcess("Process 1");
        process.addProcess("Process 2");
        process.addProcess("Process 3");
        process.addProcess("Process 4");
        process.addProcess("Process 5");
        System.out.println("Process " + process.executeProcess() + " has Done");
        process.display();
        System.out.println("Process " + process.executeProcess() + " has Done");
        process.display();
    }
}
