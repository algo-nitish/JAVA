package ArrayList;

import java.util.ArrayList;

public class Swap2Num {
    public static void swap(ArrayList<Integer>list , int Idx1 , int Idx2){
        int temp = list.get(Idx1);
        list.set(Idx1, list.get(2));
        list.set(Idx2, temp);
    }
     public static void main(String[] args) {
        // list 2,5,9,3,6
        // swap index 1 to 3
             ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
         list.add(9);   //o(n)
        list.add(3);
        list.add(6);

        int Idx1 = 1;
        int Idx2 = 3;
System.out.println(list);
    swap(list, Idx1, Idx2);
    System.out.println(list);

     }
}
