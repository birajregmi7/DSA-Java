package AdvanceLoops;

public class floyds_triangle {
    public static void floyd_pyramid(int n){
        int counter = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        inverted_pyramid(5);
        floyd_pyramid(5);

    }
}
