//Question: Write the code to print a pattern of one half of pascales triangle and take row input from the user.
import java.util.*;
public class Triangle{
  public static void main (String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number of Rows: ");
    int rows= sc.nextInt();
    int a,b,n;
    b=1;
    n=1;
    for(a=1; a<=10000; a++)
    {
      for(; b<=a; b++) //for(b=1; b<=a; b++) [If you wangt the traingle to be staright from one at all rows]
      {
        System.out.print(b+" ");
      }
      a=a+n;
      if(n<rows)
        n++;
      else
        break;
      System.out.println(); //Printing the next stream of output in next line
    }
  }
}
