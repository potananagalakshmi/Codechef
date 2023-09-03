import java.util.*;
public class StackEx{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        HashMap<Character, Integer> hmp=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
    }
    
}
