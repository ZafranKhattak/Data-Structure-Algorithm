
import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    void add(char data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
        }
        else 
        {
            tail.next = n;
            tail = n;
        }
    }

    boolean isPalindrome() {
        Node temp = head;
        String reverse = "";

        while (temp != null) {
            reverse = temp.data + reverse;
            temp = temp.next;
        }

        temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data != reverse.charAt(i)) {
                return false;
            }

            temp = temp.next;
            i++;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        LinkedList p = new LinkedList();

        for (int i = 0; i < str.length(); i++) {
            p.add(str.charAt(i));
        }

        if (p.isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
