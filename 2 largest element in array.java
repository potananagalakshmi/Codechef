import java.util.*;
public class largest{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r;
    r=sc.nextInt();
    int[] arr=new int[r];
    for(int i=0;i<r;i++)
      {
        arr[i]=sc.nextInt();
      }
    Arrays.sort(arr);
    Arrays.toString(arr);
    System.out.println(arr[r-2]);
  }
}
    
