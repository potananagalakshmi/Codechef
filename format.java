class Sample {
    public static void main(String[] args){
        int intVar=1000000;
        int intVar2=123;
        // double doubleVar=12.6;
        System.out.printf("%010d%n",intVar2);
        System.out.printf("% d",intVar);
        System.out.printf("%-100d%d",intVar2,intVar);
        double doubleVar=12.2345;
        System.out.printf("%.2f%n",doubleVar);
        System.out.printf("%020.2f",doubleVar);
    }
}
