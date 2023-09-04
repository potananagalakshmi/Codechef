public class String11 {
    public static void main(String[] args) {
        String s="I am Naga ";
        String vowels="AEIOUaeiou";
        int vowelcount=0;
        for(int i=0;i<s.length();i++)
        {
            if(vowels.contains(""+s.charAt(i))){
                vowelcount++;
            }
        } 
        System.out.println(vowelcount);
    }
    
}
