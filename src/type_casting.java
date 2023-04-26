import java.util.Scanner;

public class type_casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int marks = 99.99f; Java doesnt allow this but we do
        int marks = (int) 99.99f;
        System.out.println(marks);
    }
}
