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
		String s= sc.next();
		char b= s.charAt(0);
		if ((b=='a')||(b=='e')||(b=='i')||(b=='o')||(b=='u'))
		System.out.println("Vowel!");
		else
		System.out.println("Not a Vowel!");
		
		
	}