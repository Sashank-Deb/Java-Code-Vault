//Question: Write the code to take any number as input from user and return if its perfect number or not.

import java.io.*;
import java.util.*;
import java.lang.*;

public class PerfectNumber{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the NUMBER: ");
    int a= sc.nextInt();
    int sum=0;
    for(int i=1;i<a;i++)
    {
      if(a%i==0)
        sum=sum+i;
    }
    if(a==sum)
      System.out.println("YES, It is a Perfect number");
    else
      System.out.println("NO, It is NOT a Perfect number");
  }
}
