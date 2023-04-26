package arrays;

import java.util.Scanner;

public class array_input_output {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] =sc.nextInt();
        marks[2] =sc.nextInt();

        System.out.println("Maths :" + marks[0]);
        System.out.println("Phy :" + marks[1]);
        System.out.println("Chem :" + marks[2]);

        marks[2] = 99; // marks of chem is updated so the upper marks won't matter

        marks[2] = marks[2] + 1;
        System.out.println("Updated marks of Chem :"+marks[2]);
    }
}

