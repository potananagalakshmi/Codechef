import java.util.*;
public class String5 {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        String r=read.nextLine();
        String a="";
        char[] arr=new char[r.length()];
        for(int i=(r.length())-1;i>=0;i--)
        {
           a+=r.charAt(i);
        }
        System.out.println(a);


    }
    
}
