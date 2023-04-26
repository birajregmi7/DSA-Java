public class constructor {
    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student("Sujal");
        Student stud3 = new Student(123);
    }
    static class Student{
        String name;
        int age;

        Student(){
            System.out.println("Constructor is called...");
        }
        Student(String name){
            this.name = name;
        }
        Student(int age){
            this.age = age;
        }
    }
}
