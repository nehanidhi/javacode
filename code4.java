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
		String s= sc.next();
		char b= s.charAt(0);
		int a=(int)b;
		if ((a>=65&&a<=90)||(a>=97&&a<=122))
		System.out.println("it is an alphabet!");
		else
			System.out.println("it is not an alphabet!");
		
	}
}