package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class creating_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list1 = new ArrayList<>();

        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list); //[1, 2, 3, 4, 5]

        //get
        System.out.println(list.get(2)); //3

        //remove
        int rem = list.remove(1);
        System.out.println(list + " " +"remove");
        //set element
        int sett = list.set(0,100);
        System.out.println(sett+ " "  +"set");

        boolean contt = list.contains(2); //[100, 2, 3, 5] true

        System.out.println(contt+ " " +"contains");
    }
}
