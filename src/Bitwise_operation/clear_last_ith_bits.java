package Bitwise_operation;

public class clear_last_ith_bits {
    public static int clearlastBit(int n , int i){
        int bitWise = (~0<<i);
        return n&bitWise;
    }
    public static void main(String[] args) {
        System.out.println(clearlastBit(15,2));
    }
}
