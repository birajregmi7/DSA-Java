public class copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name ="Biraj";
        s1.roll =21;
        s1.password = "abcd";
        s1.marks[0] =100;
        s1.marks[1] =90;
        s1.marks[2]=80;

        Student s2 = new Student(s1);
        s2.password= "iop123";

        for (int i = 0; i <3 ; i++) {
            System.out.println(s2.marks[i]);
        }
    }
    static class Student{
        String name;
        int roll;
        String password;
        int[] marks;

        Student(Student s1){ // copy constructor
            marks = new  int [3];
            this.name = s1.name;
            this.roll = s1.roll;
            this.password = s1.password;
            System.out.println();
        }
        Student(){

        }
    }
}
