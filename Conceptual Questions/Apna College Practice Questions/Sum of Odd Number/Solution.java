import java.util.Scanner;

public class Solution {
    
    public static int sum()
    {
        Scanner sc  = new Scanner(System.in);

        int sum = 0 ;

        System.out.print("Enter size : ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++)
        {
            if ( i% 2!= 0)
            {
                sum += i;
            }
        }
        sc.close();
        return sum;
    }

    public static void main(String[] args) {
        // Solution sl = new Solution();
        System.out.println(Solution.sum());
    }
}
