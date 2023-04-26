public class reverse_the_number_using_formula_whileloop {
    public static void main(String[] args) {
        int n=12345;
        int last_digit;
        int reverse=0;
        while (n>0){ //here n>0 is written cuz when n=n/10 happens there comes a point where the last remaining value becomes 0, therefore it must be greater than 0
            last_digit = n %10;
            reverse = reverse*10 + last_digit;
            n=n/10;
        }
        System.out.print(reverse);
    }
}
