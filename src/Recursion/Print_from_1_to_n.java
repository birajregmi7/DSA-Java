package Recursion;

public class Print_from_1_to_n {
    public static void printAsc(int n){
        if (n==1){
            System.out.print(n + " ");
            return;
        }
        printAsc(n-1);
        System.out.print(n + " ");

    }
    public static void main(String[] args) {
        int n = 10;
        printAsc(n);
    }
}


