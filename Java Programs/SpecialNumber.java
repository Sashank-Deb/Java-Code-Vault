//Question: Write the code to take any number as input from user and return if its special number or not.

import java.io.*;
import java.util.*;
import java.lang.*;
public class SpecialNumber{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num= sc.nextInt();
    int a,b,c,sum;
    sum=0;
    for(a=num;a>0;)
    {
      b=a%10;
      a=a/10;
      c=1;
      while(b>0)
      {
        c=c*b;
        b=b-1;
      }
      sum=sum+c;
    }
    if(num==sum)
      System.out.println("YES, It is a Special number");
    else
      System.out.println("NO, It is NOT a Special number");
  }
}
