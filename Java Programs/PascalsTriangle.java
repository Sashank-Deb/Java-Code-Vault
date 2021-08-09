//Question: Write a code make Pascals Traiangle with user entered midpoint.
//(Bonus: Write the code to make diampnd with user entered midpoint.)

import java.io.*;
import java.util.*;
import java.lang.*;

public class PascalsTriangle{
  public static void main (String args[])
  {
    int a,b,n;
    Scanner sc= new Scanner(System.in);
    b=1;
    System.out.print("Enter the midpoint: ");
    int mid=sc.nextInt();
    n=mid-1;
    for(a=1;a<=mid;a++)
    {
      for(int c=n;c>0;c--)
      {
        System.out.print(" ");
        System.out.print(" ");
      }
      n=n-1;
      for(b=1;b<=a;b++)
      {
        System.out.print(b);
        System.out.print(" ");
      }
      b=b-2;
      for(;b>=1;--b)
      {
        System.out.print(b);
        System.out.print(" ");
      }
      System.out.println();
    }
    //diamond code from here
    n=1;
    for(a=mid-1;a>=1;a--)
    {
      for(int c=1;c<=n;c++)
      {
        System.out.print(" ");
        System.out.print(" ");
      }
      n=n+1;
      for(b=1;b<=a;b++)
      {
        System.out.print(b);
        System.out.print(" ");
      }
      b=b-2;
      for(;b>=1;--b)
      {
        System.out.print(b);
        System.out.print(" ");
      }
      System.out.println();
    }
    //diamond code ends here
  }
}
