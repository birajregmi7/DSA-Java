package arrays;

public class array_update_call_by_value_concept {
    public static void update(int marks[], int nonChangable){
        for (int i = 0; i <marks.length ; i++) {
            marks[i]=marks[i] +1;
            int notChangable = 5;
        }
    }

    public static void main(String[] args) {
        int marks[] ={97,98,99};
        int nonChangable = 10;// the value is not changed which was 5 at the function 
        update(marks, nonChangable);
        for (int i = 0; i <marks.length ; i++) {
            System.out.print(marks[i] +" ");
        }

        System.out.println(nonChangable);
    }
}
