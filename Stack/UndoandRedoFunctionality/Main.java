package Stack.UndoandRedoFunctionality;

import java.util.Scanner;

class Stack
{
    char array[];
    int size;
    int top;

    public Stack(int size)
    {
        this.size = size;
        array = new char[size];
        top = -1;
    }

    // ===================== PUSH =====================

    void push(char value)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
            return;
        }

        array[top + 1] = value;
        top++;
    }

    // ===================== POP =====================

    char pop()
    {
        if(isEmpty())
        {
            return '0';
        }

        char value = array[top];
        top--;

        return value;
    }

    // ===================== IS EMPTY =====================

    boolean isEmpty()
    {
        return top == -1;
    }

    // ===================== IS FULL =====================

    boolean isFull()
    {
        return top == size - 1;
    }

    // ===================== DISPLAY =====================

    void display()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }

        for(int i = top; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}


// ===================== UNDO REDO SYSTEM =====================

class UndoRedo
{
    Stack undoStack;
    Stack redoStack;

    public UndoRedo(int size)
    {
        undoStack = new Stack(size);
        redoStack = new Stack(size);
    }

    // ===================== PERFORM ACTION =====================

    void performAction(char action)
    {
        undoStack.push(action);

        // New action means old redo history is removed
        redoStack = new Stack(undoStack.size);

    }

    // ===================== UNDO =====================

    void undo()
    {
        if(undoStack.isEmpty())
        {
            System.out.println("Nothing to Undo");
            return;
        }

        char action = undoStack.pop();
        redoStack.push(action);
        System.out.println("Undo: " + action);
    }

    // ===================== REDO =====================

    void redo()
    {
        if(redoStack.isEmpty())
        {
            System.out.println("Nothing to Redo");
            return;
        }

        char action = redoStack.pop();
        undoStack.push(action);

        System.out.println("Redo: " + action);
    }

}


// ===================== MAIN CLASS =====================

public class Main
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your Actions: ");
        String str = inp.nextLine();

        UndoRedo system = new UndoRedo(str.length());

        // Perform all actions
        for(int i = 0; i < str.length(); i++)
        {
            system.performAction(str.charAt(i));
        }

        // Undo
        system.undo();

        // Undo
        system.undo();

        // Redo
        system.redo();

        // Redo
        system.redo();

        inp.close();
    }
}