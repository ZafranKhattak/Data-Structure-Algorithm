package Stack.UndoandRedoFunctionality;

import java.util.Scanner;

class UndoRedoStack {
    char array[];
    int size;
    int top;

    public UndoRedoStack(int size) {
        this.size = size;
        array = new char[size];
        this.top = -1;
    }

    // ===================== PUSH =====================

    void push(char value) {
        if (isFull()) {
            return;
        }

        array[top + 1] = value;
        top++;
    }

    // ===================== POP =====================

    char pop() {
        if (isEmpty()) {
            return '0';
        }

        char result = array[top];
        top--;

        return result;
    }

    // ===================== IS EMPTY =====================

    boolean isEmpty() {
        return top == -1;
    }

    // ===================== IS FULL =====================

    boolean isFull() {
        return top == size - 1;
    }
}

// ===================== MAIN CLASS =====================

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your Words: ");
        String str = inp.nextLine();

        // Two Stacks
        UndoRedoStack undoStack = new UndoRedoStack(str.length());
        UndoRedoStack redoStack = new UndoRedoStack(str.length());

        // ===================== PERFORM ACTIONS =====================

        for (int i = 0; i < str.length(); i++) {
            undoStack.push(str.charAt(i));

            // New action means old Redo history is cleared
            redoStack = new UndoRedoStack(str.length());
        }

        // ===================== UNDO =====================

        char undoValue = undoStack.pop();

        if (undoValue != '0') {
            redoStack.push(undoValue);
            System.out.println("Undo: " + undoValue);
        }

        // ===================== UNDO =====================

        undoValue = undoStack.pop();

        if (undoValue != '0') {
            redoStack.push(undoValue);
            System.out.println("Undo: " + undoValue);
        }

        // ===================== REDO =====================

        char redoValue = redoStack.pop();

        if (redoValue != '0') {
            undoStack.push(redoValue);
            System.out.println("Redo: " + redoValue);
        }

        // ===================== REDO =====================

        redoValue = redoStack.pop();

        if (redoValue != '0') {
            undoStack.push(redoValue);
            System.out.println("Redo: " + redoValue);
        }

        inp.close();
    }
}