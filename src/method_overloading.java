public class method_overloading {
    public static   void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,4));
        calc.sum(2.2,9.6);
        calc.sum(2,6,9);
    }


    static class Calculator{
        int sum(int a, int b){
            return a+b;
        }
        double sum(double a, double b){
            return a+b;
        }
        int sum(int a, int b, int c){
            return a+ b + c;
        }

    }
}
