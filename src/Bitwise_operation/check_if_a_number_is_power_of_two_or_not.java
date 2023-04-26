package Bitwise_operation;

public class check_if_a_number_is_power_of_two_or_not {
    public static boolean checkPower(int n){
        int bitMaks = (n&n-1);
        return bitMaks == 0;
    }
    public static void main(String[] args) {
        System.out.println(checkPower(9));
    }
}
