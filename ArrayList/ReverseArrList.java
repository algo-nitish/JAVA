package ArrayList;
import java.util.ArrayList;
public class ReverseArrList {
  public static void main(String[] args) {
     ArrayList<Integer>list = new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(34);
     list.add(23);
     list.add(21);

     //reverse the list
     for( int i = list.size()-1; i >=0;i--){
          System.out.print (list.get(i) + " ");
     } System.out.println();
  }   
}
