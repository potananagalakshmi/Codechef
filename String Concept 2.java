public class string1 {
    public static void main(String[] args){
        String s="Hello World";
        // converting to character array
        char[] arr=s.toCharArray();
        // changing
        arr[6]='W';
        // converting the character array back to string
        String result=new String(arr);
        System.out.println(result);

    }
    
}
