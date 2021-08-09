//Question: Write the code to take an array input for series of decimal numbers from the user and convert them into binary numbers.

import java.io.*;
import java.util.*;
public class DecimaltoBinary{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int arr[]= new int[100];
    System.out.print("Enter the size of the array: ");
    int len,num;
    int reminder=0;
    int bin_num[] = new int[100];
    len=sc.nextInt();
    System.out.print("Enter the elements of the array: ");
    for(int i=0;i<len;i++)
    {
      arr[i]=sc.nextInt();
    }
    if(len==1)
    System.out.print("Binary number is: ");
    else
    System.out.println("Binary number are: ");

    for(int j=0;j<len;j++)
    {
      num=arr[j];
      while(num != 0)
       {
           bin_num[reminder] = num%2;
           reminder++;
           num = num/2;
       }
           for(int index=reminder; index>=0; index--)
           {
               System.out.print(bin_num[index]);
           }
           System.out.print("\n");
           reminder=0;
    }
  }
}
