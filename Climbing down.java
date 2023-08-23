import java.util.Scanner;
public class climbingdown {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,x,y;
        a=sc.nextInt();
        b=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        double c=((a/x)+(a%x));
        double d=((b/y)+(b%y));
        if(c>d)
        {
            System.out.println("naga");
        }
        else if(c<d)
        {
            System.out.println("nag");
        }
        else
        {
            System.out.println("both");
        }



    }
    
}
