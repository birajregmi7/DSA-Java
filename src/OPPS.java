public class OPPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(3);
        System.out.println(p1.tip);
        Student s1 = new Student();
        s1.setName("Biraj");
        s1.setAge(21);
        s1.setRollno(21);
        s1.setMarks(99);
        System.out.println(s1.name);
        System.out.println(s1.marks);
    }
    static class Pen{  // this whole code is blueprint of pen
        String color; // this is attribute or properties
        int tip;// this is attribute or properties

        void setColor(String newColor){ // this is function
            color = newColor;
        }
        void setTip(int newTip){ // this is function
            tip = newTip;
        }

    }
    static class Student{ // properties + function of Student class
        String name;
        int age;
        int rollno;
        int marks;

        void setName(String newName){
            name = newName;
        }
        void setAge(int newAge){
            age = newAge;
        }
        void setRollno(int newRollno){
            rollno = newRollno;
        }
        void setMarks(int newMarks){
            marks = newMarks;
        }
    }
}
