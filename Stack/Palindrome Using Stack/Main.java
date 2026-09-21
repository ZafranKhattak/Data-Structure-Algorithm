import java.util.Scanner;

class Palindrome
{
    char array[];
    int size;
    int count;

    public Palindrome(int size)
    {
        this.size = size;
        array = new char[size];
        this.count = -1;
    }

    // =================== PUSH METHOD    =====================
    void push(char value)
    {
        if(isFull())
        {
            return ;
        }

        array[count+1] = value;
        count++;
    }

    boolean checkPalindrome(String value)
    {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return false;
        }
        String str = "";

        for(int i=count; i>=0; i--)
        {
            str += array[i];
        }
        if(str.equals(value))
        {
            return  true;
        }
        return  false;
    }
    // =================== ISMEPTY METHOD =====================
    boolean isEmpty()
    {
        return count == -1;
    }

    // =================== ISFULL METHOD =====================
    boolean isFull()
    {
        return  count == size-1;
    }
}

// ======================= MAIN CLASS =======================
class Main  
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = input.nextLine();

        Palindrome ch = new Palindrome(str.length());

        for (int i = 0; i < str.length(); i++) {
            ch.push(str.charAt(i));
        }
        System.out.println(ch.checkPalindrome(str));
    
       
        input.close();
    }
}