import java.util.Scanner;

public class guess_the_number_do_whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Guess the number:");
            int n = sc.nextInt();
            if (n == 3) {
                System.out.println("You guessed correctly");
                break;
            }

        }while (true);
    }
}
