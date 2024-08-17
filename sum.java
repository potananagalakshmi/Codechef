import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i < x; i++)
        {
            int a = sc.nextInt();
            
            if (a < 70) {
                System.out.println("0");
            } else if (a >= 70 && a <= 100) {
                System.out.println("500");
            } else if (a > 100) { 
                System.out.println("2000");
            }
        }
    }
}
