public class print_largest_of_three {
    public static void main(String[] args) {
        int a= 1, b=3, c=6;
        if (a>=b && a>=c){
            System.out.println("Largest A");
        } else if (b>=c) {
            System.out.println("Largest B");
        }
        else {
            System.out.printf("Largest C");
        }
    }
}
