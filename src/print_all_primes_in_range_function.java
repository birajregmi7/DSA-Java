public class print_all_primes_in_range_function {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i==0){
                return false;
            }
        }return true;
    }
    public static void primeinRange(int n){
        for (int i = 2; i <=n ; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        primeinRange(30);// 2 to 30
    }
}
