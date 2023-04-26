package Bitwise_operation;

public class clear_range_of_bits {
    public static int clearBits(int n, int i , int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-i;
        int bitMask =  (a|b);
        return n&bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBits(10,2,4));
    }
}
