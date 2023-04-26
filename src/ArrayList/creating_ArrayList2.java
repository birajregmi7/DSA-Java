package ArrayList;

import java.util.ArrayList;

public class creating_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5 ; i++) {
            list.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
        for (int i = 0; i <mainList.size();  i++) {
            ArrayList<Integer> CurrentList = mainList.get(i);
            for (int j = 0; j <CurrentList.size() ; j++) {
                System.out.print(CurrentList.get(j));
            }
            System.out.println();
        }


    }
}
