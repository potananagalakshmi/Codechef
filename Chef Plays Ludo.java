import java.util.Scanner;
class chef{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<=a;i++)
        {
            if(b==6)
            {
                System.out.print("YES\n");
            }
            else
            {
                System.out.print("No\n");
            }
        }
    }
} 
