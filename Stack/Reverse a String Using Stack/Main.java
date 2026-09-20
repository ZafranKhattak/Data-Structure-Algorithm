import java.util.Scanner;

class StackChar {
    char array[];
    int size;
    int count;

    public StackChar(int size) {
        this.size = size;
        array = new char[size];
        this.count = 0;
    }

    // ================== PUSH METHOD ===============

    void push(char value) {
        if (isFull()) {
            return;
        }

        array[count] = value;
        count++;
    }

    // =================== POP METHOD ================

    char pop() {
        if (isEmpty()) {
            return '0';
        }

        char value = array[count - 1];
        count--;
        return value;
    }

    // =================== DISPLAY METHOD ===============
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    // ================== ISEMTPY METHOD ===============
    boolean isEmpty() {
        return count == 0;
    }

    // ================== ISFULL METHOD =================;
    boolean isFull() {
        return count == size;
    }
}

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = input.nextLine();

        StackChar ch = new StackChar(str.length());

        for (int i = 0; i < str.length(); i++) {
            ch.push(str.charAt(i));
        }
        ch.display();
        input.close();
    }
}