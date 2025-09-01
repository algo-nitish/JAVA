package ArrayList;
import java.util.*;

public class MultiList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Mainlist = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Mainlist.add(list);
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        Mainlist.add(list1);

        int initialSize = Mainlist.size(); // avoid infinite growth loop

        for(int i = 0; i < initialSize; i++) {
            ArrayList<Integer> list2 = new ArrayList<>();
            ArrayList<Integer> list3 = new ArrayList<>();
            ArrayList<Integer> list4 = new ArrayList<>();

            for (int j = 1; j <= 5; j++) {
                list2.add(1 * j);
                list3.add(2 * j);
                list4.add(3 * j);
            }

            Mainlist.add(list2);
            Mainlist.add(list3);
            Mainlist.add(list4);

            System.out.println(Mainlist);
        }
    }
}
