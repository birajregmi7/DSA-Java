public class if_else {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("You can vote");
        }
        if (age <= 18 && age >= 13) {
            System.out.println("You are an teenager");
        }
        else if(age<13) {
                System.out.println("You are a baby");
        }
    }
}
