import java.util.Scanner;

public class display_all_number_entered_by_user_except_multiple_of_ten_continuestatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        do {
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            if (n%10==0){
                continue;
            }
            System.out.println(n);
        }while (true);
    }
}
