package Recursion;

public class sum_of_n_natural_number {
    public static int functionn(int n){
        if (n==1){
            return 1;
        }
        int f1 = functionn(n-1);
        int fn = n + f1;
        return fn;
    }
    public static void main(String[] args) {
    int n = 5;
        System.out.println(functionn(n));
    }
}
