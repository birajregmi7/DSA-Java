package arrays;

public class largest_number_array {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }System.out.println("The smallest is :"+ smallest);
        return largest;

    }

    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        int num = getLargest(numbers);
        System.out.println("The largest is :"+num);

    }
}
