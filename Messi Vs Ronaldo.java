import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=(a*2)+b;
		int f=(c*2)+d;
		if(e==f)
		{
		    System.out.println("equal");
		}
		else if(e>f)
		{
		    System.out.println("Messi");
		}
		else{
		    System.out.println("Ronaldo");
		}

	}
}
