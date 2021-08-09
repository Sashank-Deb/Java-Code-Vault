//Question: Write a program to identify repeated numbers in a user provided series. 

import java.io.*;
import java.util.*;

public class RepeatedNumbers{
  public static void main(String args[]){
    int size;
    int[] arr= new int[10];
    Scanner sc= new Scanner(System.in);
    System.out.println("Please Enter The Size of Array: ");
    size= sc.nextInt();
    System.out.println("Please Enter The Array: ");
    for(int a=0; a<size; a++)
    {
      arr[a]=sc.nextInt();
    }
    int i,j;
    int count=0;
    System.out.println("The repeated numbers are: ");
    for(i=0; i<size; i++)
    {
      for(j=i+1; j<size; j++)
      {
        if (arr[i]==arr[j])
        {
          System.out.print(arr[i]+" ");
          count= count+1;
        }
      }
    }
    if(count==0)
      System.out.print("None");
  }
}
