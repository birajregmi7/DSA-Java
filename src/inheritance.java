public class inheritance {
    public void main(String[] args) {
    Animal dobby = new Animal();
    dobby.Breathe();
    dobby.Eat();


    }
    class Animal {
        void Eat(){
            System.out.println("Eats");
        }
        void Breathe(){
            System.out.println("Breathe");
        }
    }
    class Mammal extends Animal{


        void Legs(){
            System.out.println("Has legs");
        }
    }
}

