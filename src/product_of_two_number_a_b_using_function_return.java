public class product_of_two_number_a_b_using_function_return {
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a =5;
        int b=10;
        int prod = multiply(a,b);
        System.out.println("The product is "+prod);
        prod = multiply(20,40);
        System.out.println("a*b= "+prod);
    }
}
