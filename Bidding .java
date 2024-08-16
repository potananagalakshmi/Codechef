import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(a>b && a>c)
		    {
		        System.out.println("alice");
		    }
		    else if(b>a && b>c)
		    {
		        System.out.println("bob");
		    }
		    else
		    {
		        System.out.println("charlie");
		    }
		}

	}
}
