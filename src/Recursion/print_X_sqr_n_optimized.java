package Recursion;

public class print_X_sqr_n_optimized {
    public static int optimizedPower(int a, int n){
        if (n==0){
            return 1;
        }
        int halfpower = optimizedPower(a , n/2);
        int halfpowersqr = halfpower *halfpower;
        if (n%2 !=0){
            halfpowersqr = a * halfpowersqr;
        }
        return halfpowersqr;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2,5));
    }
}
