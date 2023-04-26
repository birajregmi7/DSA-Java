public class interface_multiple_inheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();

    }
    interface herbeverous{
        void eat();
    }
    interface carniverous{
        void eat();
    }
    static class Bear implements herbeverous,carniverous{
        public void eat(){
            System.out.println("bear eats both veg and nonveg");
        }
    }
}
