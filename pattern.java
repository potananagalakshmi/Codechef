import java.util.Scanner;
public class pattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char i,j;
        int n;
        n=sc.nextInt();
        for(i=65;i<=n;i++)
        {
            for(j=65;j<=n;j++){
                System.out.print(i);
            }
            System.out.println("\n");
        }
   }  
}
