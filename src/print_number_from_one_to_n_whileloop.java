import java.util.Scanner;

public class print_number_from_one_to_n_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int n = sc.nextInt();
        while (count<=n){
            System.out.println(count);
            count++;
        }
    }
}
