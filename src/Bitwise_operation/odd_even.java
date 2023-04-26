package Bitwise_operation;

public class odd_even {
    public static void odevn(int n){
        int bitmask = 1;
        if (((n&bitmask) == 0)){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        odevn(5);
        odevn(2);
    }
}
