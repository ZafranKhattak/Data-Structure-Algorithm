import java.util.Scanner;

public class Solution {
    
    public static double circumference()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circel: ");
        double radius  = sc.nextDouble();

        sc.close();
        return 2 * 3.14* radius;
    }

    public static void main(String[] args) {
        
        System.out.println("Circumference of Radius is: " + Solution.circumference());
    }
}
