import java.util.Scanner;

class  BalancedParenthesesUsingStack
{
    char array[];
    int size;
    int count;

    public BalancedParenthesesUsingStack(int size)
    {
        this.size = size;
        array = new char[size];
        this.count = 0;
    }

    // =================== PUSH METHOD    =====================
    void push(char value)
    {
        array[count++] = value;
    }

    void balancedParanthesisChecking()
    {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return ;
        }
        for(int i=0; i<count-1; i++)
        {

            if(array[i] == '(' && array[i+1] == ')' || array[i] == '{' && array[i+1] == '}' || array[i] == '[' && array[i+1] == ']')
            {
                System.out.println("Balanced");
                 return ;
            }
            
        }

        System.out.println("Not Balanced");
    }
    // =================== ISMEPTY METHOD =====================
    boolean isEmpty()
    {
        return count == 0;
    }
}

// ======================= MAIN CLASS =======================
class Main  
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = input.nextLine();

        BalancedParenthesesUsingStack ch = new BalancedParenthesesUsingStack(str.length());

        for (int i = 0; i <str.length(); i++) {
            ch.push(str.charAt(i));
        }
        ch.balancedParanthesisChecking();     
        input.close();
    }
}