
package ArrayList;
import java.util.ArrayList;
public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        // ArrayList<String>list2 = new ArrayList<>();
        // ArrayList<Boolean>list3 = new ArrayList<>();
        
        list.add(1); //add element
         list.add(2);
         list.add(1);
         list.add(4);
         list.add(6);
         list.add(7);
         System.out.println(list);
         //To add at any element
         list.add(1, 1213);
         System.out.println(list);

         //To get any index 
          int element = list.get(2);
          System.out.println(element);

          // To remove any element from list
          list.remove(2);
          System.out.println(list);

          // Set element at index
          list.set(1, 14);
          System.out.println(list);

          // To check the element contains in list

          System.out.println(list.contains(14));
          System.out.println(list.contains(1));
          System.out.println(list.contains(22));

          System.out.println(list.size()); //method to find the size

          //To print the ArrayList
          for(int i =0 ; i< list.size(); i++){
            System.out.print(list.get(i) +" ");
          }
          System.out.println();
    }

}
