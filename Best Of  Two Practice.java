import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		    b=sc.nextInt();
		    c=sc.nextInt();
		    if(b>c)
		    {
		        System.out.println(b);
		    }
		    else
		    {
		        System.out.println(c);
		    }
		}

	}
}
