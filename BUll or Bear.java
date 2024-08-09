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
		for(int i=0;i<a;i++)
		{
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(b<c)
		    {
		        System.out.println("Profit");
		    }
		    else if (b==c)
		    {
		        System.out.println("Neutral");
		    }
		    else
		    {
		        System.out.println("Loss");
		    }
		}

	}
}
