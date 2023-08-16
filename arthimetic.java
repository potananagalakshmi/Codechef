import java.util.Scanner;
public class arth{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=a+b;
    int d=a-b;
    int e=a*b;
    int f=a%b;
    int g=a/b;
    System.out.print("Sum:"+c);
    System.out.print("Division:"+d);
    System.out.print("Multiplication:"+e);
    System.out.print("Remainder:"+f);
    System.out.print("Division:"+g);
  }
}
    
