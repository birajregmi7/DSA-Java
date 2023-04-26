package Bitwise_operation;
// to know how many 1's are there in a number
public class count_set_bit_in_a_number {
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if ((n & 1) != 0){ //checked LSB
                count ++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBit(16));
    }
}
