public class abstract_classes {
    public void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();

        Chicken c = new Chicken();
        c.walk();
        c.eat();
    }
    abstract class Animal{
        void eat() {
            System.out.println("Animal Eats");
        }
        abstract void walk();
    }
    class Horse extends Animal{
        void walk() {
            System.out.println("Horse walks on 4 legs");
        }
    }
    class Chicken extends Animal{
        void walk(){
            System.out.println("Chicken walks on 2 legs");
        }
    }
}
