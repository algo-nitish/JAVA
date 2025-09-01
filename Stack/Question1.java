package Stack;
import java.util.*;
public class Question1 {
    //Push at the bottom the stack...
    //hunko push krna he last me element in the stack parr bina upar ke element hataye 
    //O(n) time complexity b recursion
    public static void Pushbottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        Pushbottom(s, data);
        s.push(top);
    }

    public static void main(String[] args){
     Stack<Integer> s = new Stack<>();
     s.push(1);
     s.push(2);
     s.push(3);
          //1-2-3
          //4-1-2-3
     Pushbottom(s,4);
     while(!s.isEmpty()){
        System.out.println(s.pop());
     }
    }
}
