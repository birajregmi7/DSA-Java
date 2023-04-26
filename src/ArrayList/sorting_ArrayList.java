package ArrayList;
import java.util.ArrayList;
import java.util.Collections;


public class sorting_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        // ascending order sort
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // descending order sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
