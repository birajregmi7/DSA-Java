import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = (float) (3.14 *(rad*rad));
        // why are we writing (float) inside?
        // cuz if not mentioned anything java takes decimal value as default double value
        // and double doesn't change to float value
        System.out.println(area);
    }
}
