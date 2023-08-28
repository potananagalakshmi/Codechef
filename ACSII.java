import java.util.Scanner;
public class Asciiusingstring {
    public static void main(String[] args){
    //     String[] arr={"po","Shen","Kai","Tailung","Tigress","Crane"};
    //     for(String b:arr)
    //     {
    //         System.out.println(b.charAt(0)+ " " +(int)b.charAt(0)); 
    //     }
         double[] arr={2.2,5.6,7.9,45.44};
         double s=0;
         for(double a: arr)
         {
            s+=a;
         }
         System.out.printf("%.2f",s);
    
     }
    
}

