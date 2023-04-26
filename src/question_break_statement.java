import java.util.Scanner;

public class question_break_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number:");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("It's the multiple of 10 so the program is ending");
                break;
            }
        }while (true);
    }
}
