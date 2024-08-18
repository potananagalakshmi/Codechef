/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner c=new Scanner(System.in);
		int t=c.nextInt();
		while(t-->0){
		    int n=c.nextInt();
		    System.out.println((n<=70)?0:(n>70&&n<=100)?500:2000);
		}
	}
}
