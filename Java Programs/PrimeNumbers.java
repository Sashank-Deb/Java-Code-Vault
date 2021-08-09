//Question: Write the code to generate Prime Numbers till 1000.

public class PrimeNumbers{
    public static void main(String args[])
    {
        int n= 1000;
        int i= 2;
        while (i<=n)
        {
            int count=0;
            int j= 2;
            while (j<=i)
            {
                if (i%j==0)
                {
                    count++;
                }
                j++;
            }
            if (count==1)
            System.out.print(i+", ");
            i++;
        }
        
    }
}
