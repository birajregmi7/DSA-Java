import java.util.Scanner;

public class print_sum_of_first_n_natural_number_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1;
        int sum=0;
        int n = sc.nextInt();
        while (i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum is"+" "+sum);

    }
}
