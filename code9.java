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
		int s;s=0;
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			 s=(i*(i-1))/2;
		
		System.out.println("sum="+s);
		}
	}
}