package Recursion;

public class print_nth_fibonaci_number {
    public static int fib(int n){
        if (n==0 || n==1){
            return n;
        }
        int fm1 = fib(n-1);
        int fim2 = fib(n-2);
        int fn = fm1 + fim2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
