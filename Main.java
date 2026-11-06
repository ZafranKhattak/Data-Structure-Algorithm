class Factorial 
{
    int fact(int n)
    {
        if(n<=1) return 1;

        return n* fact(n-1);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Factorial f = new Factorial();

        System.out.println(f.fact(-10));
    }
}
