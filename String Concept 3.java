public class String3 {
    public static void main(String[] args){

    String s="Hello world";
    char[] arr=new char[s.length()];
    // int i=0;
    // for(int j=0;j<s.length();j++)
    // {
    //     arr[i]=s.charAt(j);
    //     i++;
    // }
    // System.out.println(arr);
   for(int i=(s.length())-1;i>=0;i--)
   {
    System.out.println(s.charAt(i)+" ");
   }
}
}
