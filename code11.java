
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
		int n= sc.nextInt();
		int r,sum=0,temp;    
        temp=n;    
        while(n>0)
        {    
         r=n%10;  //getting remainder  
         sum=(sum*10)+r;    
         n=n/10;    
         }    
        if(temp==sum)    
        System.out.println("palindrome number ");    
        else    
        System.out.println("not palindrome");    
    }  
}  
		
	