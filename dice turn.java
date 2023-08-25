import java.util.Scanner;
class naga{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int x,a,b,c;
        x=s.nextInt();
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        for(int i=0;i<=x;i++)
        {
            if(c<=6)
            {
               System.out.print("YES\n");
            }
            else{
                System.out.print("NO");
            }
        }
    }
}
