import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0; i<a;i++)
		{
		    int c=sc.nextInt();
		    if(c%3==0)
		    {
		        System.out.println("yes");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}

	}
}
