package OOPS;
public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Setcolor("blue");
        System.out.println(p1.color);
        p1.Settip(5);
        System.out.println(p1.tip);
        // p1.Setcolor("yellow");
        // System.out.println(p1.getColor());
       
    }
}

class Pen{
   String color;
    int tip;
     
    // String getColor(){
    //     return this.color;
    // }
    // int getTip(){
    //     return this.tip;
    // }
 
    void Setcolor(String newcolor) {
          color = newcolor;
    }
   void Settip(int NewTip){
         tip = NewTip;
   }
}

// BankAccount ckass with Access Modifiers
 
