class Demo
{
    double [] number[] ;

    Demo(double [] number[])
    {
        this.number = number;
    }

    void display()
    {
        for (double row []: number)
        {
            for (double col : row)
            {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}

class Test
{
    public static void main(String[] args) {
        
        double [] num [] = {
            {85.0, 90.0, 88.0, 92.0, 87.0},  
            {78.0, 82.0, 80.0, 85.0, 79.0},  
            {92.0, 95.0, 90.0, 93.0, 91.0} 
        };

        Demo inp = new Demo(num);

        inp.display();
    }


}