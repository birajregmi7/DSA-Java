public class method_overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
   static class Animal {
       void eat(){
           System.out.println("Eats");
        }
    }
    static class Deer{
        void eat(){
            System.out.println("Eats grass");
        }
    }
}
