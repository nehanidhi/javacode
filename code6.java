import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
				 int y;
     
      Scanner in = new Scanner(System.in);
 
      y = in.nextInt();
      if(y%100==0)
      {
      	if (y%400==0)
      	System.out.println("it is a leap year:"+y);
      }
      else if(y%4==0)
      System.out.println("it is a leap year:"+y);
      else
        System.out.println("it is NOT a leap year:"+y);
      
      
	}
}