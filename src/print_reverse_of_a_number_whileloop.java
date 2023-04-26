public class print_reverse_of_a_number_whileloop {
    public static void main(String[] args){
        int n=68954;
        int last_digit;
        while (n>0){
            last_digit = n%10;
            System.out.print(last_digit);
            n/=10;
        }

    }
}
