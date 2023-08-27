public class arrays3 {
    public static void main(String[] args){
        int[][] arr={{10,20,30},{40,50,60},{70,80,90}};
        for(int[] eachInnerArray:arr){
            for(int eachValue:eachInnerArray) {
                System.out.print(eachValue+" ");
            }
            System.out.println();
        }
    }
}
