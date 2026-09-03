import java.util.Scanner;

public class Solution
{
    public double averageFinding()
    {
        double avg = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter first number: ");
        int num3 = sc.nextInt();

        avg = (num1+num2+num3)/3.0;

        sc.close();
        return avg;


    }
    public static void main(String[] args) {
        
        Solution sl = new Solution();

        System.out.println("The average is :" + sl.averageFinding());
    }
    
}