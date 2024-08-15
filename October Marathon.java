import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner (System.in);
		int a=sc.nextInt();
		if(a<3)
		{
		    System.out.println("Gold");
		}
		else if (a>=3 && a<6)
		{
		    System.out.println("silver");
		}
		else{
		    System.out.println("Bronze");
		 }
	}
}
