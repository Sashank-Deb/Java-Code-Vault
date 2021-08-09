//Question: Write the code to take inputs from user and generate a Fibonacci sequence with any starting point

import java.io.*;
import java.util.*;
import java.lang.*;
public class Fibonacci
{
  public static void main(String args[])
  {
    int a=0;
    int b=1;
    int sum;
    Scanner sc= new Scanner(System.in);
    System.out.println("Select the type of Fibonacci Sequence to be generated:");
    System.out.println("1. Default [1]");
    System.out.println("2. Custom  [2]");
    int option= sc.nextInt();
    if(option==1){
      System.out.println("The Fibonacci Sequence is:");
      System.out.print(a+" ");
      System.out.print(b+" ");
      while(b<=1000000)
      {
        sum=a+b;
        System.out.print(sum+ " ");
        a=b;
        b=sum;
      }     
    }
    else{
      System.out.print("Enter the first Number: ");
      a=sc.nextInt();
      System.out.print("Enter the second Number: ");
      b=sc.nextInt();

      System.out.println("The Fibonacci Sequence is:");
      System.out.print(a+" ");
      System.out.print(b+" ");
      while(b<=1000000)
      {
        sum=a+b;
        System.out.print(sum+ " ");
        a=b;
        b=sum;
      } 
    }
  }
}
