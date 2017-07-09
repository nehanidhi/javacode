/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		float d,c;c=0;
		int n= sc.nextInt();
		while(n>0)
		{
			n=n/10;
			c++;
			
		}
		System.out.println("no of digits:"+c);
	}
}