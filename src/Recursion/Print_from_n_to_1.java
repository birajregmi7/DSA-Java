package Recursion;

public class Print_from_n_to_1 {
    public static int printDec(int n){
        if (n==1){
            System.out.println(n);
            return 1;
        }
        System.out.println(n + " ");
       int fn = printDec(n-1);
       return fn;
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
