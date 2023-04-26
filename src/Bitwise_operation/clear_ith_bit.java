package Bitwise_operation;

public class clear_ith_bit {
    public static int clearithbit(int n , int i){
        int bitWise = ~(1<<i);
        return (n&bitWise);
    }

    public static void main(String[] args) {
        System.out.println(clearithbit(10,1));
    }
}
