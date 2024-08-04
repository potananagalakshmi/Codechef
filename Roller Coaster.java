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
        int c,b;
        for(int i=0;i<a;i++)
        {
            c=sc.nextInt();
            b=sc.nextInt();
            if(c>=b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        
	}
}
