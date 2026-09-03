class AmountParser
{
    public static double parseNonNegativeAmount(String text)
    {

        if (text.isEmpty())
        {
            text.trim();
            throw new IllegalArgumentException("Empty Input");
        }

        try
        {
            Double.parseDouble(text);
        }
        catch(NumberFormatException ex)
        {
             throw new IllegalArgumentException("not a number: " + text, ex);
        }

        if(Double.parseDouble(text) < 0)
        {
           throw new IllegalArgumentException("negative not allowed");
        }

        return Double.parseDouble(text);
        
    }

    public static double sumNonNegativeAmounts(String[] lines)
    {

        double sum =0.0;
        try{
            for (int i=0; i<lines.length; i++)
            {
                sum +=Double.parseDouble(lines[i]);
               
                Double.parseDouble(lines[i]);
            }

        }
        catch(IllegalArgumentException e)
        {
                throw new IllegalArgumentException();
        }

        return sum;
    }
}

class Main
{
    public static void main(String[] args) {
        
       System.out.println( AmountParser.parseNonNegativeAmount("123"));
       
       String lines[] = { "10", "20.5", "30" } ;
       System.out.println( AmountParser.sumNonNegativeAmounts(lines));
    }
}